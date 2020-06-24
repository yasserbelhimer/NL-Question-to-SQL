package App;

import java.util.*;
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
import org.antlr.v4.runtime.DefaultErrorStrategy;
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
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        SyntaxError syntaxError = new SyntaxError();           
        parser.addErrorListener(syntaxError); // add ours   
        final ParseTree tree = parser.wh_question();

        ArrayList<String> measures = new ArrayList<>();
        ArrayList<String> filter = new ArrayList<>();
        ArrayList<String> dimention = new ArrayList<>();
        
        ArrayList<String> candidateMeasures = Analyse.getCandidateMeasures(tree, parser);

        

        ArrayList<HashMap<String,ArrayList<String>>> candidateFilters = Analyse.getCandidateFilters(tree, parser);
        ArrayList<HashMap<String,ArrayList<String>>> candidateDimensions = Analyse.getCandidateDimensions(tree, parser);
        ArrayList<String> candidateFilter = new ArrayList<>();
        ArrayList<String> candidateDimention = new ArrayList<>();

        ArrayList<Term> validateDimensions = Analyse.getValidateDimensions(candidateDimensions);

        //ArrayList<String> tempList = new ArrayList<>();
        System.out.println("------------------ dimensions ---------------------");
        for(HashMap<String,ArrayList<String>> hashMap:candidateDimensions){
            for(String key : hashMap.keySet())
            {
                if(!candidateDimention.contains(key))
                    candidateDimention.add(key);
                for(String string:hashMap.get(key)){
                    if(!candidateFilter.contains(string)) 
                        candidateFilter.add(string);
                }
                System.out.print("key :"+key+"\tvalues :");
                for(String string:hashMap.get(key)){
                    System.out.print(" "+string);
                }
                System.out.println("");
            }
        }

        System.out.println("validate dimension :");
        for(Term term:validateDimensions){
            if(!dimention.contains(term.getTable()))
                dimention.add(term.getTable());
            System.out.println(term.getTerm());
        }
        System.out.println("------------------ filters ---------------------");
        for(String key : candidateFilters.get(0).keySet()){
            candidateDimention.add(key);
            System.out.print("dim :"+key);
            for(String value : candidateFilters.get(0).get(key)){
                candidateFilter.add(value);
                System.out.println("0 :"+key+" " + value);
            }
        }
        for(String key : candidateFilters.get(1).keySet()){
            candidateDimention.add(key);
            System.out.print("dim :"+key);
            for(String value : candidateFilters.get(1).get(key)){
                candidateFilter.add(value);
                System.out.println("1 :" + value);
            }
        }
        for(String key : candidateFilters.get(2).keySet()){
            candidateDimention.add(key);
            System.out.print("dim :"+key);
            for(String value : candidateFilters.get(2).get(key)){
                candidateFilter.add(value);
                System.out.println("2 :" + value);
            }
        }
        System.out.println("------------------ validate filters ---------------------");
        // ArrayList<Filter>   validateFilter = Analyse.getValidateFilters(candidateFilters);
        
        ArrayList<Term>     myMeasures  = Analyse.getValidateMeasures(candidateMeasures);
        //ArrayList<Term>     myDimensions  = new ArrayList<>();
        // ArrayList<Filter>   myFilters   = Analyse.getFilters(tree, parser);
        ArrayList<Filter>   myFilters   =  Analyse.getValidateFilters(candidateFilters);;
        for(Filter f:myFilters){
            System.out.println("dim : "+f.getFilterName()+" : val "+f.getFilterValue());
        }
        for(Term t :myMeasures){
            if(!measures.contains(t.getTerm()))
                measures.add(t.getTerm());
        }

        HashMap<String,ArrayList<String>> dimensionsAndFilter = Analyse.dimensionsAndFilter(tree, parser);
        //System.out.println("--------------------- filters -------------------------");
        for(String fil:dimensionsAndFilter.get("filters")){
            if(!filter.contains(fil))
                filter.add(fil);
        }
        
        for(Filter f:myFilters){
            if(!filter.contains(f.getFilterValue()))
                filter.add(f.getFilterValue());
            if(!dimention.contains(f.getFilterTable()))
                dimention.add(f.getFilterTable());
        }

        
        

        // ----------- desplaying the Queries ------------
        ArrayList<String> queries = new ArrayList<>();
        //ArrayList<String> selectedTables = new ArrayList<>();
        if(!myMeasures.isEmpty()){
            Collections.sort(myMeasures, new SortByPourcentage());
            HashSet<Object> seen=new HashSet<>();
            myMeasures.removeIf(e->!seen.add(e.getTerm()));
            queries = Analyse.generateQuery(myMeasures, myFilters);
        }
        else {
            Collections.sort(validateDimensions, new SortByPourcentage());
            HashSet<Object> seen=new HashSet<>();
            validateDimensions.removeIf(e->!seen.add(e.getTerm()));
            queries     =    Analyse.generateQuery(validateDimensions, myFilters);
        }
        request.setAttribute("taggedSentence", taggedSentence);
        request.setAttribute("measers", measures);
        request.setAttribute("candidateMeasers", candidateMeasures);
        request.setAttribute("dimentions", dimention);
        request.setAttribute("candidateDimentions",candidateDimention);
        request.setAttribute("filters", filter);
        request.setAttribute("candidateFilters", candidateFilter);
        request.setAttribute("Queries", queries);

        request.getRequestDispatcher("response.jsp").forward(request, response);
    }

}
