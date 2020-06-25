package App;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.*;

import java.util.*;

public class SyntaxError extends BaseErrorListener {
    private boolean error;
    private String messageError;


    public SyntaxError(){
        super();
        error = false;
        messageError = "";

    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        this.error = true;
        this.messageError +=msg+"<br>";
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

    public String getMessageError() {
        return this.messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

}