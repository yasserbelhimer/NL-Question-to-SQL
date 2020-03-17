package App;

import java.io.IOException;
import java.util.ArrayList;

import com.generated.parser.QaLexer;
import com.generated.parser.QaParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.xpath.XPath;


public class App {
    public static void main(String[] args) throws IOException {

        String myQuestion = "what is the quantity of the drugs sold in the year 2018 ?";
        myQuestion = myQuestion.toLowerCase();
        PoSTagger tagSentence = new PoSTagger(myQuestion);
        String taggedSentence = tagSentence.getTaggedSentence();
        
        CharStream input = CharStreams.fromString(taggedSentence);
        QaLexer lexer = new QaLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        QaParser parser = new QaParser(commonTokenStream);

        final ParseTree tree = parser.qa();
        ArrayList<String> measures = new ArrayList<>();
        ArrayList<String> pastParticiple = new ArrayList<>();
        for (ParseTree t : XPath.findAll(tree, "/qa/ng//measure_indicator", parser) ) {
          measures.add(t.getText().split("_")[0]);
        }
        for (ParseTree t : XPath.findAll(tree, "/qa/ng//past_participle", parser) ) {
          pastParticiple.add(t.getText().split("_")[0]);
        }

        System.out.println("\nLes mesures :\n");
        for(String s :measures)
          System.out.println(s);
    
        System.out.println("\nLes past participles :\n");
        for(String s :pastParticiple)
          System.out.println(s);
    }
}
