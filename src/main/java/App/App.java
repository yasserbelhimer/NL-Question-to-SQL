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
        

        // ----------- desplaying the measers ------------
        ArrayList<Term>     myMeasures  = Analyse.getMeasures(tree, parser);
        ArrayList<Term>     myDimensions  = new ArrayList<>();
        ArrayList<Filter>   myFilters   = Analyse.getFilters(tree, parser);
        if(myMeasures.isEmpty()){
            myDimensions = Analyse.getDimensions(tree, parser);
        }
        HashMap<String,ArrayList<String>> dimensionsAndFilter = Analyse.dimensionsAndFilter(tree, parser);
 
        System.out.println("------------------- dimensions ------------------------");
        for(String dim:dimensionsAndFilter.get("dimensions")){
            if(!dimention.contains(dim))
                dimention.add(dim);
        }
        System.out.println("--------------------- filters -------------------------");
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
        
        /*System.out.println("--------------------- drug -------------------------");
        MySql.getFKey("drug");
        System.out.println("--------------------- drug-sold -------------------------");
        MySql.getFKey("drug_sold");
        System.out.println("--------------------- drug_depot -------------------------");
        MySql.getFKey("drug_depot");
        System.out.println("--------------------- city -------------------------");
        MySql.getFKey("city");
        System.out.println("--------------------- supplier -------------------------");
        MySql.getFKey("supplier");
        System.out.println("--------------------- consumer -------------------------");
        MySql.getFKey("consumer");
        System.out.println("--------------------- year -------------------------");
        MySql.getFKey("year");
        System.out.println("--------------------- month -------------------------");
        MySql.getFKey("month");
        System.out.println("--------------------- day -------------------------");
        MySql.getFKey("day");
        System.out.println("---------------------  -------------------------");*/

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
        ArrayList<String> selectedTables = new ArrayList<>();
        if(!myMeasures.isEmpty()){
            Collections.sort(myMeasures, new SortByPourcentage());
            HashSet<Object> seen=new HashSet<>();
            myMeasures.removeIf(e->!seen.add(e.getTerm()));
            for (Term m : myMeasures) {
                String      query = new String ();
                boolean     firstChange = true;
                int i = 0;
                while(i<myFilters.size()-1){
                    if(firstChange){
                        HashMap<String,String> importedKeys = MySql.getImportedKeys(m.getTable());
                        if(importedKeys.containsKey(myFilters.get(i).getFilterID())){
                            query += "SELECT " + m.getTerm() + " FROM " + m.getTable() +" WHERE "+myFilters.get(i).getFilterID() + " IN ( SELECT " 
                            + myFilters.get(i).getFilterID() + " FROM " + myFilters.get(i).getFilterTable() + " WHERE "+
                            myFilters.get(i).getFilterName() + " = '" + myFilters.get(i).getFilterValue() +"'";
                            firstChange = false;
                        }
                    }
                    else{
                        query += " OR "+myFilters.get(i).getFilterName()+" = '"+myFilters.get(i).getFilterValue()+"'";
                    }

                    if(!myFilters.get(i).getFilterName().equals(myFilters.get(i+1).getFilterName())){
                        query += " )";
                        firstChange = true;
                        if(!queries.contains(query))
                            queries.add(query);
                        if(!selectedTables.contains(m.getTable()))
                            selectedTables.add(m.getTable());

                        query = "";
                    }
                    i++;
                }
                if(i<myFilters.size()){
                    if(firstChange){
                        HashMap<String,String> importedKeys = MySql.getImportedKeys(m.getTable());
                        if(importedKeys.containsKey(myFilters.get(i).getFilterID())){
                            query += "SELECT " + m.getTerm() + " FROM " + m.getTable() +" WHERE "+myFilters.get(i).getFilterID() + " IN ( SELECT " 
                            + myFilters.get(i).getFilterID() + " FROM " + myFilters.get(i).getFilterTable() + " WHERE "+
                            myFilters.get(i).getFilterName() + " = '" + myFilters.get(i).getFilterValue() +"')";
                        }
                    }
                    else{
                        query += " OR "+myFilters.get(i).getFilterName()+" = '"+myFilters.get(i).getFilterValue()+"')";
                    }
                    if(!queries.contains(query))
                        queries.add(query);
                    if(!selectedTables.contains(m.getTable()))
                        selectedTables.add(m.getTable());
                }
                
            }
            
            for (Term m : myMeasures) {
                String query = "SELECT " + m.getTerm() + " FROM " + m.getTable();
                if(!queries.contains(query))
                    queries.add(query);
                if(!selectedTables.contains(m.getTable()))
                    selectedTables.add(m.getTable());
            }
        }
        else {
            Collections.sort(myDimensions, new SortByPourcentage());
            HashSet<Object> seen=new HashSet<>();
            myDimensions.removeIf(e->!seen.add(e.getTerm()));
            for (Term m : myDimensions) {
                String      query = new String ();
                boolean     firstChange = true;
                int i = 0;
                while(i<myFilters.size()-1){
                    if(firstChange){
                        HashMap<String,String> exportedKeys = MySql.getExportedKeys(m.getTable());
                        if(exportedKeys.containsKey(myFilters.get(i).getFilterID())){
                            query += "SELECT " + m.getTerm() + " FROM " + m.getTable() +" WHERE "+myFilters.get(i).getFilterID() + " IN ( SELECT " 
                            + myFilters.get(i).getFilterID() + " FROM " + myFilters.get(i).getFilterTable() + " WHERE "+
                            myFilters.get(i).getFilterName() + " = '" + myFilters.get(i).getFilterValue() +"'";
                            firstChange = false;
                        }
                        else{
                            // int N = Tables.dimensionTable.size()+Tables.measureTables.size()+Tables.temporalLexion.size();
                            // int compt =0;
                            // boolean found = false;
                            // ArrayList<String> exportedTables = MySql.getExportedFKeysTables(m.getTable());
                            // while(compt < N && !found){
                            //     for(String table:exportedTables){
                            //         HashMap<String,String> importedKeys = MySql.getExportedFKeys(table);
                            //         if(importedKeys.containsKey(myFilters.get(i).getFilterID())){
                            //             query += "SELECT " + m.getTerm() + " FROM " + m.getTable() +" WHERE "+myFilters.get(i).getFilterID() + " IN ( SELECT " 
                            //             + myFilters.get(i).getFilterID() + " FROM " + myFilters.get(i).getFilterTable() + " WHERE "+
                            //             myFilters.get(i).getFilterName() + " = '" + myFilters.get(i).getFilterValue() +"')";
                            //             found = true;
                            //             break;
                            //         }
                            //         System.out.println(table);
                            //     }
                                
                            //     compt++;
                            // }

                            Stack<ArrayList<String>> myStack = new Stack<>();
                            Stack<String> myList = new Stack<>();
                            boolean trouvee = false;
                            ArrayList<String> list = MySql.getKeysTables(m.getTable());
                            myList.push(m.getTable());
                            while(!trouvee){
                                if(list.contains(myFilters.get(i).getFilterTable())){
                                    myList.push(myFilters.get(i).getFilterTable());
                                    trouvee = true;
                                }
                                else{
                                    if(list.size()>0){
                                        String l = list.get(0);
                                        list.remove(0);
                                        myStack.push(list);
                                        list.clear();
                                        list = MySql.getKeysTables(l);
                                        myList.push(l);
                                    }
                                    else{
                                        list = myStack.pop();
                                        myList.pop();
                                    }

                                }
                            }
                            // for(String k : myList){
                            //     System.out.println(k);
                            // }
                                
                        }
                    }
                    else{
                        query += " OR "+myFilters.get(i).getFilterName()+" = '"+myFilters.get(i).getFilterValue()+"'";
                    }

                    if(!myFilters.get(i).getFilterName().equals(myFilters.get(i+1).getFilterName())&&!firstChange){
                        query += " )";
                        firstChange = true;
                        if(!queries.contains(query))
                            queries.add(query);
                        if(!selectedTables.contains(m.getTable()))
                            selectedTables.add(m.getTable());

                        query = "";
                    }
                    i++;
                }
                if(i<myFilters.size()){
                    if(firstChange){
                        HashMap<String,String> exportedKeys = MySql.getExportedKeys(m.getTable());
                        if(exportedKeys.containsKey(myFilters.get(i).getFilterID())){
                            query += "SELECT " + m.getTerm() + " FROM " + m.getTable() +" WHERE "+myFilters.get(i).getFilterID() + " IN ( SELECT " 
                            + myFilters.get(i).getFilterID() + " FROM " + myFilters.get(i).getFilterTable() + " WHERE "+
                            myFilters.get(i).getFilterName() + " = '" + myFilters.get(i).getFilterValue() +"')";
                        }
                        else{
                            // int N = Tables.dimensionTable.size()+Tables.measureTables.size()+Tables.temporalLexion.size();
                            // int compt =0;
                            // boolean found = false;
                            // ArrayList<String> exportedTables = MySql.getExportedFKeysTables(m.getTable());
                            // while(compt < N && !found){
                            //     for(String table:exportedTables){
                            //         HashMap<String,String> importedKeys = MySql.getExportedFKeys(table);
                            //         if(importedKeys.containsKey(myFilters.get(i).getFilterID())){
                            //             query += "SELECT " + m.getTerm() + " FROM " + m.getTable() +" WHERE "+myFilters.get(i).getFilterID() + " IN ( SELECT " 
                            //             + myFilters.get(i).getFilterID() + " FROM " + myFilters.get(i).getFilterTable() + " WHERE "+
                            //             myFilters.get(i).getFilterName() + " = '" + myFilters.get(i).getFilterValue() +"')";
                            //             found = true;
                            //             break;
                            //         }
                            //         System.out.println(table);
                            //     }
                                
                            //     compt++;
                            // }

                            
                        }
                    }
                    else{
                        query += " OR "+myFilters.get(i).getFilterName()+" = '"+myFilters.get(i).getFilterValue()+"')";
                    }
                    if(!queries.contains(query))
                        queries.add(query);
                    if(!selectedTables.contains(m.getTable()))
                        selectedTables.add(m.getTable());
                }
                
            }
            
            for (Term m : myDimensions) {
                String query = "SELECT " + m.getTerm() + " FROM " + m.getTable();
                if(!queries.contains(query))
                    queries.add(query);
                if(!selectedTables.contains(m.getTable()))
                    selectedTables.add(m.getTable());
            }
        }
        for (String table:selectedTables){
            String query = "SELECT * FROM " + table;
            if(!queries.contains(query))
                queries.add(query);
        }
        request.setAttribute("taggedSentence", taggedSentence);
        request.setAttribute("measers", myMeasures);
        request.setAttribute("dimentions", dimention);
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
