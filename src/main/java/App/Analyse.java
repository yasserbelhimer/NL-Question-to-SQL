package App;

import java.util.ArrayList;
import java.util.HashMap;

import com.generated.parser.QaParser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.xpath.XPath;

import edu.stanford.nlp.ling.CoreAnnotations.FirstChildAnnotation;
import info.debatty.java.stringsimilarity.*;


public class Analyse {


    //------------------- generate the suggestion measures ---------------------------
    public static ArrayList<ArrayList<String>> getSuggestionMeasures(ParseTree tree,QaParser parser){
        ArrayList<ArrayList<String>> suggestionMeasures = new ArrayList<ArrayList<String>>();
        ArrayList<String> measures = new ArrayList<>();
        ArrayList<String> measuresPastParticiples = new ArrayList<>();
        ArrayList<String> measuresNouns = new ArrayList<>();
        for (ParseTree t : XPath.findAll(tree, "/qa/ng", parser)) {
            measures.clear();
            for (ParseTree t2 : XPath.findAll(t, "ng//measure_indicator", parser)) {
                measures.add(t2.getText().replaceAll("_[A-Z.]+", ""));
            }
            if (!measures.isEmpty()) {
                for (ParseTree past : XPath.findAll(t, "ng//past_participle", parser)) {
                    if(!past.getText().equals("been_VBN"))
                        measuresPastParticiples.add(past.getText().replaceAll("_[A-Z.]+", ""));
                }
                for (ParseTree noune : XPath.findAll(t, "ng//noun", parser)) {
                    measuresNouns.add(noune.getText().replaceAll("_[A-Z.]+", ""));
                }
                suggestionMeasures.add(nGram(measures, measuresNouns, measuresPastParticiples));
            }
        }
        return suggestionMeasures;
    }

    //---------------------- filter the suggestion measures ---------------
    public static ArrayList<Term> getMeasures(ParseTree tree,QaParser parser){
        ArrayList<ArrayList<String>> suggestionMeasures = getSuggestionMeasures(tree,parser);
        ArrayList<Term> myMeasures = new ArrayList<>();
        String[] myTables = MySql.getTables().split("\n");
        JaroWinkler jw = new JaroWinkler();
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
        return myMeasures;
    }

    //------------------- generate the suggestion Dimensions ---------------------------
    public static ArrayList<ArrayList<String>> getSuggestionDimensions(ParseTree tree,QaParser parser){
        ArrayList<ArrayList<String>> suggestionDimensions = new ArrayList<ArrayList<String>>();
        ArrayList<String> dimensions = new ArrayList<>();
        ArrayList<String> dimensionsNouns = new ArrayList<>();
        for (ParseTree t : XPath.findAll(tree, "/qa/ng", parser)) {
            dimensions.clear();
            boolean first = true;
            for (ParseTree t2 : XPath.findAll(t, "ng//noun", parser)) {
                if(first){
                    dimensions.add(t2.getText().replaceAll("_[A-Z.]+", ""));
                    first = false;
                }
            }
            if (!dimensions.isEmpty()) {
                for (ParseTree noune : XPath.findAll(t, "ng//noun", parser)) {
                    dimensionsNouns.add(noune.getText().replaceAll("_[A-Z.]+", ""));
                }
                suggestionDimensions.add(nGram(dimensions, dimensionsNouns, new ArrayList<>()));
            }
        }
        return suggestionDimensions;
    }

        //---------------------- filter the suggestion dimensions ---------------
        public static ArrayList<Term> getDimensions(ParseTree tree,QaParser parser){
            ArrayList<ArrayList<String>> suggestionDimensions = getSuggestionDimensions(tree, parser);
            ArrayList<Term> myDimensions = new ArrayList<>();
            String[] myTables = MySql.getTables().split("\n");
            JaroWinkler jw = new JaroWinkler();
            for(ArrayList<String> list1:suggestionDimensions){
                for (String s : list1) {
                    for (String table : myTables) {
                        if (Tables.dimensionTable.containsKey(table)) {
                            for (String attribute : Tables.dimensionTable.get(table)) {
                                if (jw.similarity(attribute, s) >= 0.8) {
                                    Term myTerm = new Term(attribute, table, jw.similarity(attribute, s));
                                    if(!myDimensions.contains(myTerm))
                                        myDimensions.add(myTerm);
                                }
                            }
                        }
                    }
                }
            }
            return myDimensions;
        }
    
    //------------------- generate the suggestion fillters --------------------
    public static HashMap<String,ArrayList<String>> getSuggestionFilters(ParseTree tree,QaParser parser){
        HashMap<String,ArrayList<String>> suggestionFilters = new HashMap<>();
        ArrayList<String> temporalLexion = new ArrayList<>();
        ArrayList<String> temporalLexionNouns = new ArrayList<>();
        ArrayList<String> temporalLexionDate = new ArrayList<>();
        for (ParseTree tree1 : XPath.findAll(tree, "/qa/filter", parser)) {
            temporalLexion.clear();
            for (ParseTree tree2 : XPath.findAll(tree1, "/filter//temporal_lexion", parser)) {
                temporalLexion.add(tree2.getText().replaceAll("_[A-Z.]+", ""));
            }
            if (!temporalLexion.isEmpty()) {
                for (ParseTree noun : XPath.findAll(tree1, "/filter//noun", parser)) {
                    temporalLexionNouns.add(noun.getText().replaceAll("_[A-Z.]+", ""));
                }
                for (ParseTree date : XPath.findAll(tree1, "/filter//date", parser)) {
                    temporalLexionDate.add(date.getText().replaceAll("_[A-Z.]+", ""));
                }
                if(!temporalLexionNouns.isEmpty()){
                    for(String lexion :temporalLexion ){
                        suggestionFilters.put(lexion, new ArrayList<>(temporalLexionNouns));
                    }
                    temporalLexionNouns.clear();
                }
                if(!temporalLexionDate.isEmpty()){
                    for(String lexion :temporalLexion ){
                        suggestionFilters.put(lexion,new ArrayList<>(temporalLexionDate));
                    }
                    temporalLexionDate.clear();
                }
            }
        }
        return suggestionFilters;
    }
    
    //------------- filter the suggestion filters -------------------------
    public static ArrayList<Filter> getFilters(ParseTree tree,QaParser parser){
        HashMap<String,ArrayList<String>> suggestionFilters = getSuggestionFilters(tree,parser);
        ArrayList<Filter> myFilers = new ArrayList<>();
        String[] myTables = MySql.getTables().split("\n");
        JaroWinkler jw = new JaroWinkler();
        for(String key:suggestionFilters.keySet()){
            for (String s : suggestionFilters.get(key)) {
                for (String table : myTables) {
                    if (Tables.temporalLexion.containsKey(table)) {
                        for (String attribute : Tables.temporalLexion.get(table)) {
                            if (jw.similarity(attribute, key) >= 0.8) {
                                ArrayList<String> values = MySql.getFilterValue("SELECT "+attribute+" FROM "+table+" WHERE "+attribute+" = '"+s+"'",attribute);
                                
                                Filter filter = new Filter(attribute, MySql.getPKey(table), table, s, jw.similarity(attribute, key));
                                if(values.size()>0){
                                    if(!myFilers.contains(filter))
                                        myFilers.add(filter);
                                }
                            }
                        }
                    }
                    else if(Tables.dimensionTable.containsKey(table)){
                        for (String attribute : Tables.dimensionTable.get(table)) {
                            if (jw.similarity(attribute, key) >= 0.8) {
                                ArrayList<String> values = MySql.getFilterValue("SELECT "+attribute+" FROM "+table+" WHERE "+attribute+" = '"+s+"'",attribute);

                                Filter filter = new Filter(attribute, MySql.getPKey(table), table, s, jw.similarity(attribute, key));
                                if(values.size()>0){
                                    if(!myFilers.contains(filter))
                                        myFilers.add(filter);
                                }
                            }
                        }
                    }
                }
            }
        }
        return myFilers;
    }

    public static HashMap<String,ArrayList<String>> dimensionsAndFilter(ParseTree tree,QaParser parser){
        ArrayList<String> dimensions = new ArrayList<>();
        ArrayList<String> filters = new ArrayList<>();
        HashMap<String,ArrayList<String>> dimensionsAndFilter = new HashMap<>();
        String[] myTables = MySql.getTables().split("\n");
        JaroWinkler jw = new JaroWinkler();
        for (ParseTree tree1 : XPath.findAll(tree, "/qa//noun", parser)) {
            boolean found   = false;
            ArrayList<String> myNouns = new ArrayList<>();
            myNouns.add(tree1.getText().replaceAll("_[A-Z.]+", ""));

            for(String noun:myNouns){
                for(String table:Tables.dimensionTable.keySet()){
                    if(jw.similarity(table, noun)>=0.8 && !found){
                        if(!dimensions.contains(table))
                            dimensions.add(table);
                        found = true;
                    }
                    else{
                        for(String attribute:Tables.dimensionTable.get(table)){
                            if(jw.similarity(attribute, noun)>=0.8){
                                if(!dimensions.contains(attribute))
                                    dimensions.add(attribute);
                                found=true;
                            }
                        }
                    }
                }
                if(!found){
                    for(String table:Tables.temporalLexion.keySet()){
                        if(jw.similarity(table, noun)>=0.8 && !found){
                            if(!dimensions.contains(table))
                                dimensions.add(table);
                            found = true;
                        }
                        else{
                            for(String attribute:Tables.temporalLexion.get(table)){
                                if(jw.similarity(attribute, noun)>=0.8){
                                    if(!dimensions.contains(attribute))
                                        dimensions.add(attribute);
                                    found=true;
                                }
                            }
                        }
                    }
                }
                if(!found){
                    filters.add(noun);
                }
            }
        }
        dimensionsAndFilter.put("dimensions", dimensions);
        dimensionsAndFilter.put("filters", filters);
        return dimensionsAndFilter;
    }

    
    public static ArrayList<String> nGram(ArrayList<String> list1,ArrayList<String> list2,ArrayList<String> list3){
        ArrayList<String> myList = new ArrayList<>();
        for(String l1:list1){
            myList.add(l1);
            for(String l2 : list2)
                myList.add(l1+" "+l2);
            for(String l3 : list3)
                myList.add(l1+" "+l3);
            for(String l2 : list2)
                for(String l3 : list3)
                    myList.add(l1+" "+l2+" "+l3);
        }
        return myList ;
    }
}