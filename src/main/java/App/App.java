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

import SDM.Concept;
import SDM.Sdm;

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

        for(HashMap<String,ArrayList<String>> hashMap:candidateDimensions){
            for(String key : hashMap.keySet())
            {
                if(!candidateDimention.contains(key))
                    candidateDimention.add(key);
                for(String string:hashMap.get(key)){
                    if(!candidateFilter.contains(string)) 
                        candidateFilter.add(string);
                }
                if(!hashMap.get(key).isEmpty()){
                    candidateFilters.add(hashMap);
                }
            }
        }

        for(Term term:validateDimensions){
            if(!dimention.contains(term.getTable()))
                dimention.add(term.getTable());
        }

        for(HashMap<String,ArrayList<String>> hashMap:candidateFilters){
            for(String key : hashMap.keySet()){
                candidateDimention.add(key);
                for(String value : hashMap.get(key)){
                    candidateFilter.add(value);
                }
            }
        }
        ArrayList<Term>     myMeasures  = Analyse.getValidateMeasures(candidateMeasures);
        ArrayList<Filter>   myFilters   =  Analyse.getValidateFilters(candidateFilters);;
        for(Term t :myMeasures){
            if(!measures.contains(t.getTerm()))
                measures.add(t.getTerm());
        }

        for(Filter f:myFilters){
            if(!filter.contains(f.getFilterValue()))
                filter.add(f.getFilterValue());
            if(!dimention.contains(f.getFilterTable()))
                dimention.add(f.getFilterTable());
        }


        // ----------- desplaying the Queries ------------
        ArrayList<String> queries = new ArrayList<>();
        String pronom = Analyse.getPronom(tree, parser);

        if(pronom.equals("what") || pronom.equals("who")){
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
        }
        else if(pronom.equals("where")){
            ArrayList<Term> terms = new ArrayList<>();
            for(Concept concept:Sdm.sapatialDimension){
                for(String attribute:concept.getAttribute()){
                    terms.add(new Term(attribute, concept.getTable(),0.5));
                }
            }
            queries     =    Analyse.generateQuery(terms, myFilters);
        }
        else  if(pronom.equals("when")){
            queries     =    Analyse.generateQueryWhen(myFilters);
        }
        String error = "";
        if(queries.isEmpty()){
            error += "1";
        }
        else if(syntaxError.isError()){
            error += syntaxError.getMessageError();
        }
        request.setAttribute("taggedSentence", taggedSentence);
        request.setAttribute("measers", measures);
        request.setAttribute("candidateMeasers", candidateMeasures);
        request.setAttribute("dimentions", dimention);
        request.setAttribute("candidateDimentions",candidateDimention);
        request.setAttribute("filters", filter);
        request.setAttribute("candidateFilters", candidateFilter);
        request.setAttribute("Queries", queries);
        request.setAttribute("error", error);

        request.getRequestDispatcher("response.jsp").forward(request, response);
    }

}
