package App;

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


@WebServlet(name = "App", urlPatterns = { "analyse" }, loadOnStartup = 1)
public class App extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String myQuestion = request.getParameter("question");
        PoSTagger tagSentence = new PoSTagger(myQuestion);
        String taggedSentence = tagSentence.getTaggedSentence();

        CharStream input = CharStreams.fromString(taggedSentence);
        QaLexer lexer = new QaLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        QaParser parser = new QaParser(commonTokenStream);

        final ParseTree tree = parser.qa();

        ArrayList<String> measures = new ArrayList<>();
        ArrayList<String> pastParticiple = new ArrayList<>();
        for (ParseTree t : XPath.findAll(tree, "/qa/ng//measure_indicator", parser)) {
            measures.add(t.getText().split("_")[0]);
        }
        for (ParseTree t : XPath.findAll(tree, "/qa/ng//past_participle", parser)) {
            pastParticiple.add(t.getText().split("_")[0]);
        }

        //----------- desplaying the measers ------------
        String measersString = "";
        for (String s : measures)
            measersString += s + "\n";

        //----------- desplaying the pastParticiples ------------
        String pastParticiples = "";
        for (String s : pastParticiple)
            pastParticiples += s + "\n";

        request.setAttribute("taggedSentence", taggedSentence);
        request.setAttribute("measers", measersString);
        request.setAttribute("pastParticiples", pastParticiples);
        request.getRequestDispatcher("response.jsp").forward(request, response); 
    }
}
