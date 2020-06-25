package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

import com.generated.parser.QaParser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.xpath.XPath;

import SDM.Concept;
import SDM.Measure;
import SDM.Sdm;
import info.debatty.java.stringsimilarity.*;


public class Analyse {


    //----------------------- get the question pronom ---------------------------
    public static String getPronom(ParseTree tree,QaParser parser){
        String pronom = new String();
        for(ParseTree t : XPath.findAll(tree, "/wh_question/question_pronoun", parser))
            pronom = t.getText().replaceAll("_[A-Z.]+", "");
        return pronom;
    }
    
    //------------------- generate the candidate measures ---------------------------
    public static ArrayList<String> getCandidateMeasures(ParseTree tree,QaParser parser){
        ArrayList<String> candidateMeasures = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        for (ParseTree t : XPath.findAll(tree, "/wh_question/ng", parser)) {
            tempList.clear();
            for (ParseTree t2 : XPath.findAll(t, "ng//measure_indicator", parser)) {
                tempList.add(t2.getText().replaceAll("_[A-Z.]+", ""));
            }
            if (!tempList.isEmpty()) {
                candidateMeasures.add(t.getText().replaceAll("_[A-Z.]+", " "));
            }
        }
        return candidateMeasures;
    }
    //------------------- get the validate measures ---------------------------
    public static ArrayList<Term> getValidateMeasures(ArrayList<String> candidateMeasures){
        ArrayList<Term> validateMeasures = new ArrayList<>();
        JaroWinkler jw = new JaroWinkler();
        for(Measure measure : Sdm.measures){
            for(String candidateMeasure : candidateMeasures){
                if(jw.similarity(measure.getName(), candidateMeasure) >= 0.5){
                    validateMeasures.add(new Term(measure.getColumn(), measure.getTable(), jw.similarity(measure.getName(), candidateMeasure)));
                }
            }
        }
        return validateMeasures;
    }

    //------------------- generate the candidate Dimensions ---------------------------
    public static ArrayList<HashMap<String,ArrayList<String>>> getCandidateDimensions(ParseTree tree,QaParser parser){
        ArrayList<HashMap<String,ArrayList<String>>> candidateDimensions = new ArrayList<>();
        HashMap<String,ArrayList<String>> dimensionsTempo = new HashMap<>();
        ArrayList<String> dimensions = new ArrayList<>();
        for (ParseTree t : XPath.findAll(tree, "/wh_question/ng", parser)) {
            for (ParseTree t2 : XPath.findAll(t, "ng//noun", parser)) {
                dimensions.add(t2.getText().replaceAll("_[A-Z.]+", ""));
            }
            if (!dimensions.isEmpty()) {
                String key = dimensions.get(0);
                dimensions.remove(0);
                dimensionsTempo.put(key,new ArrayList<>(dimensions));
                candidateDimensions.add(new HashMap<>(dimensionsTempo));
                dimensions.clear();
                dimensionsTempo.clear();
            }
        }
        return candidateDimensions;
    }
    //------------------------ get the validate dimensions ----------------------------
    public static ArrayList<Term> getValidateDimensions(ArrayList<HashMap<String,ArrayList<String>>> candidateDimensions){
        ArrayList<Term> validateDimensions = new ArrayList<>();
        JaroWinkler jw = new JaroWinkler();
        ArrayList<Concept> dimensions = new ArrayList<>(Sdm.temporalDimension);
        dimensions.addAll(Sdm.sapatialDimension);
        dimensions.addAll(Sdm.otherDimension);
        for(Concept concept : dimensions ){
            for(HashMap<String,ArrayList<String>> hashMap:candidateDimensions){
                for(String key : hashMap.keySet())
                {
                    if(jw.similarity(concept.getTable(), key) >= 0.8){
                        for(String attribute:concept.getAttribute()){
                            Term myTerm = new Term(attribute, concept.getTable(), jw.similarity(concept.getTable(), key));
                            if(!validateDimensions.contains(myTerm)){
                                validateDimensions.add(myTerm);
                            }
                        }
                    }
                    // else wordnet

                }
            }
        }
        return validateDimensions;
    }

    //------------------- generate the candidate fillters --------------------
    public static ArrayList<HashMap<String,ArrayList<String>>> getCandidateFilters(ParseTree tree,QaParser parser){
        HashMap<String,ArrayList<String>> temporalLexion = new HashMap<String,ArrayList<String>>();
        HashMap<String,ArrayList<String>> spatialLexion = new HashMap<String,ArrayList<String>>();
        HashMap<String,ArrayList<String>> otherLexion = new HashMap<String,ArrayList<String>>();
        ArrayList<HashMap<String,ArrayList<String>>> candidateFilters = new ArrayList<>();

        ArrayList<String> tempo = new ArrayList<>();

        ArrayList<String> temporalLexionNouns = new ArrayList<>();
        ArrayList<String> spatialLexionNouns = new ArrayList<>();
        ArrayList<String> temporalLexionDate = new ArrayList<>();

        for (ParseTree tree1 : XPath.findAll(tree, "/wh_question/filter", parser)) {
            tempo.clear();
            for (ParseTree tree2 : XPath.findAll(tree1, "/filter//temporal_lexion", parser)) {
                tempo.add(tree2.getText().replaceAll("_[A-Z.]+", ""));
            }
            if (!tempo.isEmpty()) {
                for (ParseTree noun : XPath.findAll(tree1, "/filter//noun", parser)) {
                    temporalLexionNouns.add(noun.getText().replaceAll("_[A-Z.]+", ""));
                }
                for (ParseTree date : XPath.findAll(tree1, "/filter//date", parser)) {
                    temporalLexionDate.add(date.getText().replaceAll("_[A-Z.]+", ""));
                }
                if(!temporalLexionNouns.isEmpty()){
                    for(String lexion :tempo ){
                        if(!temporalLexion.containsKey(lexion))
                            temporalLexion.put(lexion, new ArrayList<>(temporalLexionNouns));

                    }
                    temporalLexionNouns.clear();
                }
                if(!temporalLexionDate.isEmpty()){
                    for(String lexion :tempo ){
                        if(!temporalLexion.containsKey(lexion))
                            temporalLexion.put(lexion,new ArrayList<>(temporalLexionDate));
                    }
                    temporalLexionDate.clear();
                }
            }
        }
        for (ParseTree tree1 : XPath.findAll(tree, "/wh_question/filter", parser)) {
            tempo.clear();
            for (ParseTree tree2 : XPath.findAll(tree1, "/filter//spatial_lexion", parser)) {
                tempo.add(tree2.getText().replaceAll("_[A-Z.]+", ""));
            }
            if (!tempo.isEmpty()) {
                for (ParseTree noun : XPath.findAll(tree1, "/filter//noun", parser)) {
                    spatialLexionNouns.add(noun.getText().replaceAll("_[A-Z.]+", ""));
                }
                if(!spatialLexionNouns.isEmpty()){
                    for(String lexion :tempo ){
                        spatialLexion.put(lexion, new ArrayList<>(spatialLexionNouns));
                    }
                    spatialLexionNouns.clear();
                }
            }
        }
        if(temporalLexion.isEmpty()&&spatialLexion.isEmpty()){
            for (ParseTree tree1 : XPath.findAll(tree, "/wh_question/filter", parser)) {
                tempo.clear();
                for (ParseTree t2 : XPath.findAll(tree1, "filter//noun", parser)) {
                    tempo.add(t2.getText().replaceAll("_[A-Z.]+", ""));
                }
                if (!tempo.isEmpty()) {
                    String key = tempo.get(0);
                    tempo.remove(0);
                    if(!tempo.isEmpty()){
                        if(!otherLexion.containsKey(key))
                            otherLexion.put(key,new ArrayList<>(tempo));
                        else{
                            ArrayList<String> tempo1 = new ArrayList<>(otherLexion.get(key));
                            for(String string :tempo)
                                tempo1.add(string);
                            otherLexion.put(key, tempo1);
                        }
                    }
                    
                }
            }
            //--------- add here yesterday,last ...
        }
        candidateFilters.add(temporalLexion);
        candidateFilters.add(spatialLexion);
        candidateFilters.add(otherLexion);
        return candidateFilters;
    }
    //------------------- get the validate filters ------------------------
    public static ArrayList<Filter> getValidateFilters(ArrayList<HashMap<String,ArrayList<String>>> candidateFilters){
        ArrayList<Filter> myFilers = new ArrayList<>();
        ArrayList<HashMap<String,ArrayList<String>>> candidateFilter = new ArrayList<>();
        for(int i = 0;i<candidateFilters.size();i++)
            candidateFilter.add(candidateFilters.get(i));

        ArrayList<Concept> mySDM = new ArrayList<>();
        mySDM.addAll(Sdm.temporalDimension);
        mySDM.addAll(Sdm.sapatialDimension);
        mySDM.addAll(Sdm.otherDimension);
        JaroWinkler jw = new JaroWinkler();
        for(HashMap<String,ArrayList<String>> hashMap:candidateFilter){
            for(String key:hashMap.keySet()){
                for (String s : hashMap.get(key)) {
                    for(Concept concept : mySDM){
                        for(String attribute : concept.getAttribute()){
                            if(jw.similarity(attribute,key)>=0.8){
                                ArrayList<String> values = MySql.getFilterValue("SELECT "+attribute+" FROM "+concept.getTable()+" WHERE "+attribute+" = '"+s+"'",attribute);
                                Filter filter = new Filter(attribute, concept.getId(), concept.getTable(), s, jw.similarity(attribute, key));
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


    public static ArrayList<String> generateQuery(ArrayList<Term> terms,ArrayList<Filter> filters){
        ArrayList<String> queries = new ArrayList<>();
        ArrayList<String> selectedTables = new ArrayList<>();
        Collections.sort(filters);
        ArrayList<ArrayList<Filter>> myFilters = new ArrayList<ArrayList<Filter>>();
        int i = 0;
        String tab = new String();
        ArrayList<Filter> filtersTemp = null;
        for(int j = 0;j<filters.size();j++){
            if(i==0){
                tab = filters.get(j).getFilterTable();
                filtersTemp = new ArrayList<>();
            }
            if(tab.equals(filters.get(j).getFilterTable())){
                filtersTemp.add(filters.get(j));
                i++;
            }
            else{
                myFilters.add(filtersTemp);
                i=0;
            }
            if(j==filters.size()-1){
                myFilters.add(filtersTemp);
            }
        }
        for(Term term:terms){
            for(ArrayList<Filter> filtersTempo:myFilters){
                String tabKey[] = new String[2];
                if(!filtersTempo.isEmpty()){
                    tabKey[0]   =   filtersTempo.get(0).getFilterTable();
                    tabKey[1]   =   filtersTempo.get(0).getFilterID();
                }
                ArrayList<String[]> keysAndTables = MySql.getKeysAndTables(term.getTable());
                Stack<ArrayList<String[]>> myStack = new Stack<ArrayList<String[]>>();
                Stack<String[]> myList = new Stack<>();
                boolean trouvee = false;
                ArrayList<String> took = new ArrayList<>();
                for(String[] tabsAndKeys:keysAndTables){
                    if(tabsAndKeys[0].equals(term.getTable())){
                        if(!containsTab(myList, tabsAndKeys))
                            myList.push(tabsAndKeys);
                        break;
                    }
                }
                while(!trouvee ){
                    if(containsTab(keysAndTables,tabKey)){
                        if(!containsTab(myList, tabKey))
                            myList.push(tabKey);
                        trouvee = true;
                    }
                    else{
                            String[] l = new String[2];
                            boolean thereIsOne = false;
                            do{
                                if(keysAndTables.size()>0){
                                    l = keysAndTables.get(0);
                                    keysAndTables.remove(0);
                                    thereIsOne = true;  
                                }
                                else
                                    thereIsOne = false;  
                            }while(keysAndTables.size()>0 && took.contains(l[0]));
                            if(keysAndTables.size()>0){
                                myStack.push(new ArrayList<>(keysAndTables));
                                keysAndTables.clear();
                                keysAndTables = MySql.getKeysAndTables(l[0]);
                                took.add(l[0]);
                                if(!containsTab(myList, l))
                                    myList.push(l);
                            }
                            else if(thereIsOne){
                                if(!took.contains(l[0])){
                                    keysAndTables = MySql.getKeysAndTables(l[0]);
                                    took.add(l[0]);
                                    if(!containsTab(myList, l))
                                        myList.push(l);
                                }
                            }
                            else{
                                if(myStack.size()>0){
                                    keysAndTables = myStack.pop();
                                }
                                else
                                    break;
                                if(myList.size()>0)
                                    myList.pop();
                            }
                    }
                }

                ArrayList<ArrayList<String[]>> tablesAndKeys= new ArrayList<ArrayList<String[]>>();
                ArrayList<Integer> tab1 = new ArrayList<>();
                for(String[] s:myList){
                    tablesAndKeys.add(MySql.getKeysAndTables(s[0]));
                }

                for(int j = 0;j<tablesAndKeys.size()-2;j++){
                    for(int k = j+2;k<tablesAndKeys.size();k++){
                        if(calculerDif(tablesAndKeys.get(j), tablesAndKeys.get(k))>1){
                            if(!tab1.contains(k-1))
                                tab1.add(k-1);
                        }
                    }
                }


                int nbRemove = 0;
                for(int j:tab1){
                    myList.remove(j-nbRemove);
                    nbRemove++;
                }
                for(int j = myList.size()-1;j>0;j--){
                    String[] com =  commun(MySql.getExportedKeysAndTables(myList.get(j)[0]),MySql.getExportedKeysAndTables(myList.get(j-1)[0]));
                    if(!containsTab(myList, com)){
                        myList.set(j-1, com);
                    }
                }
                String query = "";
                for(int j = myList.size()-1;j>=0;j--){
                    if(j==myList.size()-1){
                        boolean     firstChange = true;
                        i = 0;
                        while(i<filtersTempo.size()){
                            if(firstChange){
                                query += "(SELECT " + myList.get(j)[1] + " FROM " + myList.get(j)[0] +" WHERE "+
                                filtersTempo.get(i).getFilterName() + " = '" + filtersTempo.get(i).getFilterValue() +"'";
                                firstChange = false;
                            }
                            else{
                                query += " OR "+filtersTempo.get(i).getFilterName()+" = '"+filtersTempo.get(i).getFilterValue()+"'";
                            }
                            if(i == filtersTempo.size()-1){
                                query += " )";
                            }
                            i++;
                        }
                    }
                    else if(j==0){
                        if(query.length()>0){
                            query = "SELECT " + term.getTerm() + " FROM " + term.getTable() +" WHERE "+myList.get(j)[1]+ " IN "+query;
                        }
                        if(!queries.contains(query))
                                queries.add(query);
                        if(!selectedTables.contains(term.getTable()))
                            selectedTables.add(term.getTable());
                    }
                    else{
                        query = "(SELECT " + myList.get(j-1)[1] + " FROM " + myList.get(j)[0] +" WHERE "+
                        myList.get(j)[1] + " IN " + query +")";
                    }
                }
            }
        }
        for (Term term : terms) {
            String query = "SELECT " + term.getTerm() + " FROM " + term.getTable();
            if(!queries.contains(query))
                queries.add(query);
            if(!selectedTables.contains(term.getTable()))
                selectedTables.add(term.getTable());
        }
        for (String table:selectedTables){
            String query = "SELECT * FROM " + table;
            if(!queries.contains(query))
                queries.add(query);
        }    
        return queries;
    }

    public static ArrayList<String> generateQueryWhen(ArrayList<Filter> myFilters){
        ArrayList<String> queries = new ArrayList<>();
        String firstQuery = "";
        String secQuery = "";
        String thirdQuery = "";
        boolean first = true;
        for(Concept concept:Sdm.temporalDimension){
            if(first){
                firstQuery= "SELECT "+concept.getName();
                secQuery = " FROM " + concept.getTable();
                first = false;
            }
            else{
                firstQuery+=","+concept.getName();
                secQuery+=","+concept.getTable();
            }
        }
        first = true;
        for(int i = Sdm.temporalDimension.size()-1;i>0;i--){
            if(first){
                thirdQuery=" WHERE "+Sdm.temporalDimension.get(i).getTable()+"."+Sdm.temporalDimension.get(i).getId()+" = "
                +Sdm.temporalDimension.get(i-1).getTable()+"."+Sdm.temporalDimension.get(i).getId();
                first=false;
            }
            else{
                thirdQuery+=" AND "+Sdm.temporalDimension.get(i).getTable()+"."+Sdm.temporalDimension.get(i).getId()+" = "
                +Sdm.temporalDimension.get(i-1).getTable()+"."+Sdm.temporalDimension.get(i).getId();
            }
        }
        Collections.sort(myFilters);
        
        ArrayList<ArrayList<Filter>> separedFilters = new ArrayList<ArrayList<Filter>>();
        int i = 0;
        String tab = "";
        ArrayList<Filter> filtersTemp = new ArrayList<>();
        
        for(int j = 0;j<myFilters.size()-1;j++){
            tab = myFilters.get(j).getFilterTable();
            if(!tab.equals( myFilters.get(j+1).getFilterTable() ) && j==0){
                filtersTemp.add(myFilters.get(j));
                separedFilters.add(new ArrayList<>(filtersTemp));
                filtersTemp.clear();
            }
            else if(!tab.equals( myFilters.get(j+1).getFilterTable() )){
                separedFilters.add(new ArrayList<>(filtersTemp));
                filtersTemp.clear();
            }
            else{
                filtersTemp.add(myFilters.get(j));
            }
            i++;
        }
        if(i<myFilters.size()){
            if(tab.equals(myFilters.get(i).getFilterTable() )){
                filtersTemp.clear();
                int j = separedFilters.size()-1;
                filtersTemp.addAll(separedFilters.get(j));
                filtersTemp.add(myFilters.get(i));
                separedFilters.remove(j);
                separedFilters.add(new ArrayList<>(filtersTemp));
            }
            else{
                filtersTemp.clear();
                filtersTemp.add(myFilters.get(i));
                separedFilters.add(new ArrayList<>(filtersTemp));
            }
        }
        filtersTemp.clear();
        
        Concept concept = Sdm.temporalDimension.get(0);
        String query = " AND " +concept.getId()+" IN ( SELECT "+concept.getId()+" FROM ";
        for(int l = 0;l<separedFilters.size();l++){
            ArrayList<Filter> filtersTempo = new ArrayList<>(separedFilters.get(l)) ;
            
            String commun = MySql.getCommunTable(filtersTempo.get(0).getFilterTable(), concept.getTable());
            if(l==0){
                boolean     firstChange = true;
                i = 0;
                while(i<filtersTempo.size()){
                    if(firstChange){ 
                        query +=commun+" WHERE "+ filtersTempo.get(i).getFilterID()+" IN (SELECT " + filtersTempo.get(i).getFilterID()
                        + " FROM " + filtersTempo.get(i).getFilterTable()
                        +" WHERE "+filtersTempo.get(i).getFilterName()+" = '" + filtersTempo.get(i).getFilterValue() +"'";
                        firstChange = false;
                    }
                    else{
                        query += " OR "+filtersTempo.get(i).getFilterName()+" = '"+filtersTempo.get(i).getFilterValue()+"'";
                    }
                    if(i == filtersTempo.size()-1){
                        query += " )";
                    }
                    i++;
                }
                if(separedFilters.size()-1==0){
                    query += " )";
                }
            }
            else if(l==separedFilters.size()-1){
                boolean     firstChange = true;
                i = 0;
                while(i<filtersTempo.size()){
                    if(firstChange){ 
                        query +=" AND "+ filtersTempo.get(i).getFilterID()+" IN (SELECT " + filtersTempo.get(i).getFilterID()
                        + " FROM " + filtersTempo.get(i).getFilterTable()
                        +" WHERE "+filtersTempo.get(i).getFilterName()+" = '" + filtersTempo.get(i).getFilterValue() +"'";
                        firstChange = false;
                    }
                    else{
                        query += " OR "+filtersTempo.get(i).getFilterName()+" = '"+filtersTempo.get(i).getFilterValue()+"'";
                    }
                    if(i == filtersTempo.size()-1){
                        query += " )";
                    }
                    i++;
                }
                query += " )";
            }
            else{
                boolean     firstChange = true;
                i = 0;
                while(i<filtersTempo.size()){
                    if(firstChange){ 
                        query +=" AND "+ filtersTempo.get(i).getFilterID()+" IN (SELECT " + filtersTempo.get(i).getFilterID()
                        + " FROM " + filtersTempo.get(i).getFilterTable()
                        +" WHERE "+filtersTempo.get(i).getFilterName()+" = '" + filtersTempo.get(i).getFilterValue() +"'";
                        firstChange = false;
                    }
                    else{
                        query += " OR "+filtersTempo.get(i).getFilterName()+" = '"+filtersTempo.get(i).getFilterValue()+"'";
                    }
                    if(i == filtersTempo.size()-1){
                        query += " )";
                    }
                    i++;
                }
            }
        }
        queries.add(firstQuery+secQuery+thirdQuery+query);
        return queries;
    }
    
    public static boolean containsTab(ArrayList<String[]> arrayList,String[] tab){
        for(String[] list:arrayList){
            if(list[0]!=null && tab[0]!=null || list[1]!=null || tab[1]!=null){
                if(list[0].equals(tab[0]) && list[1].equals(tab[1]))
                    return true;
            }    
        }

        return false;
    }
    public static boolean containsTab(Stack<String[]> arrayList,String[] tab){
       
        for(String[] list:arrayList){
            if(list[0]!=null && tab[0]!=null || list[1]!=null || tab[1]!=null){
                if(list[0].equals(tab[0]) && list[1].equals(tab[1]))
                    return true;
            }
        }

        return false;
    }

    public static int calculerDif(ArrayList<String[]> arrayList1,ArrayList<String[]> arrayList2){
        int dif = 0;
        for(String[] array1:arrayList1){
            for(String[] array2:arrayList2){
                if(array1.length>1 &&array2.length>1){
                    if(array1[0].equals(array2[0]) && array1[1].equals(array2[1]))
                        dif++;
                }
            }
        }
        return dif;
    }
    public static String[] commun(ArrayList<String[]> arrayList1,ArrayList<String[]> arrayList2){
        String[] com = new String[2];
        for(String[] array1:arrayList1){
            for(String[] array2:arrayList2){
                if(array1.length>1 &&array2.length>1){
                    if(array1[0].equals(array2[0]) && array1[1].equals(array2[1]))
                        com = array1;
                }
            }
        }
        return com;
    }

}