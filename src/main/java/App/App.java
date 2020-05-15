package App;

import java.util.*;
import java.io.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import com.generated.parser.QaLexer;
import com.generated.parser.QaParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.xpath.XPath;
import info.debatty.java.stringsimilarity.*;
import java.util.HashMap;

@WebServlet(name = "App", urlPatterns = { "analyse" }, loadOnStartup = 1)
public class App extends HttpServlet {
    public App() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String myQuestion = request.getParameter("question");
        PoSTagger tagSentence = new PoSTagger(myQuestion.toLowerCase());
        String taggedSentence = tagSentence.getTaggedSentence();

        CharStream input = CharStreams.fromString(taggedSentence);
        QaLexer lexer = new QaLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        QaParser parser = new QaParser(commonTokenStream);

        final ParseTree tree = parser.qa();

        ArrayList<String> measures = new ArrayList<>();
        ArrayList<String> filter = new ArrayList<>();
        ArrayList<String> dimention = new ArrayList<>();
        
        ArrayList<ArrayList<String>> suggestionMeasures = new ArrayList<ArrayList<String>>();


        String[] myTables = MySql.getTables().split("\n");
        JaroWinkler jw = new JaroWinkler();

        suggestionMeasures = Analyse.getSuggestionMeasures(tree, parser);

        for (ParseTree t : XPath.findAll(tree, "/qa/filter", parser)) {
            filter.add(t.getText().replaceAll("_[A-Z.]+", " "));
        }

        // ----------- desplaying the measers ------------
        ArrayList<Term> myMeasures = new ArrayList<>();
        for(ArrayList<String> list1:suggestionMeasures){
            for (String s : list1) {
                for (String table : myTables) {
                    if (Tables.measureTables.containsKey(table)) {
                        for (String attribute : Tables.measureTables.get(table)) {
                            if (jw.similarity(attribute, s) >= 0.9) {
                                myMeasures.add(new Term(attribute, table, jw.similarity(attribute, s)));
                            }
                        }
                    }
                }
            }
        }
    
        // ----------- desplaying the dimentions ------------

        /*ArrayList<Term> myDimentions = new ArrayList<>();
        for (String s : dimention) {
            for (String table : myTables) {
                if (myDimensions.containsKey(table)) {
                    for (String attribute : myDimensions.get(table)) {
                        if (jw.similarity(attribute, s) >= 0.5) {
                            myDimentions.add(new Term(attribute,table,jw.similarity(attribute, s)));
                        }
                    }
                }
            }
        }
        */
        // ----------- desplaying the Queries ------------
        ArrayList<String> queries = new ArrayList<>();
        Collections.sort(myMeasures, new SortByPourcentage());
        ArrayList<String> selectedTables = new ArrayList<>();
        for (Term m : myMeasures) {
            String query = "SELECT " + m.getTerm() + " FROM " + m.getTable();
            if(!queries.contains(query))
                queries.add(query);
            if(!selectedTables.contains(m.getTable()))
                selectedTables.add(m.getTable());
        }
        for (String table:selectedTables){
            String query = "SELECT * FROM " + table;
            if(!queries.contains(query))
                queries.add(query);
        }
        request.setAttribute("taggedSentence", taggedSentence);
        request.setAttribute("measers", myMeasures);
        //request.setAttribute("dimentions", myDimentions);
        request.setAttribute("filters", filter);
        request.setAttribute("Queries", queries);
        //Levenshtein l = new Levenshtein();

        // request.setAttribute("distance",
        // StringUtils.getJaroWinklerDistance(filters,measersString));
        // request.setAttribute("distance", l.distance("yasher", "hello"));
        // request.setAttribute("distance", jw.similarity("supplier_email", "numbre"));
        // request.setAttribute("distance1", l.distance("quantity_sold", "quantity of
        // the drugs sold"));
        request.getRequestDispatcher("response.jsp").forward(request, response);
    }
}
