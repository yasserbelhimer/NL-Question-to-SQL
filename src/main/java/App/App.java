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
        ArrayList<String> mes = new ArrayList<>();

        MySql mySql = new MySql();
        HashMap<String, HashMap<String, String[]>> measersAndDimensions = mySql.getMeasersAndDimensions();
        HashMap<String, String[]> myMeasers = measersAndDimensions.get("measers");
        HashMap<String, String[]> myDimensions = measersAndDimensions.get("dimensions");
        String[] myTables = mySql.showTables().split("\n");
        JaroWinkler jw = new JaroWinkler();

        for (ParseTree t : XPath.findAll(tree, "/qa/ng", parser)) {
            mes.clear();
            for (ParseTree t2 : XPath.findAll(t, "ng//measure_indicator", parser)) {
                
                mes.add(t2.getText());
            }
            if (!mes.isEmpty()) {
                measures.add(t.getText().replaceAll("_[A-Z.]+", " "));
            } else {
                dimention.add(t.getText().replaceAll("_[A-Z.]+", " "));
            }
        }
        for (ParseTree t : XPath.findAll(tree, "/qa/filter", parser)) {
            filter.add(t.getText().replaceAll("_[A-Z.]+", " "));
        }
        // ----------- desplaying the measers ------------
        ArrayList<Term> myMeasures = new ArrayList<>();
        for (String s : measures) {
            for (String table : myTables) {
                if (myMeasers.containsKey(table)) {
                    for (String attribute : myMeasers.get(table)) {
                        if (jw.similarity(attribute, s) >= 0.5) {
                            System.out.println("S : "+s);
                            System.out.println("attribute : "+attribute);
                            myMeasures.add(new Term(attribute, table, jw.similarity(attribute, s)));
                        }
                    }
                }
            }
        }
        // ----------- desplaying the dimentions ------------

        ArrayList<Term> myDimentions = new ArrayList<>();
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

        // ----------- desplaying the Queries ------------
        String[] queries = new String[20];
        int i=0;
        Collections.sort(myMeasures, new SortByPourcentage());
        for (Term m : myMeasures) {
            queries[i]= "SELECT " + m.getTerm() + " FROM " + m.getTable();i++;
        }
        request.setAttribute("taggedSentence", taggedSentence);
        request.setAttribute("measers", myMeasures);
        request.setAttribute("dimentions", myDimentions);
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
