package App;



import java.util.ArrayList;

import com.generated.parser.QaParser;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.xpath.XPath;

public class Analyse {

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