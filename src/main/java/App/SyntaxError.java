package App;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.*;

import java.util.*;

public class SyntaxError extends BaseErrorListener {
    private boolean error;



    public SyntaxError(){
        super();
        error = false;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        this.error = true;
        // List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        // Collections.reverse(stack);
        // System.err.println("rule stack: "+stack);
        // System.err.println("line "+line+":"+charPositionInLine+" at "+
        //                    offendingSymbol+": "+msg);
    }
    public boolean isError() {
        return this.error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}