package formula.parser.token.term;


import formula.Symbol;
import formula.expression.SymbolicVariable;
import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public class VariableToken extends TermToken {
    public VariableToken(String token) {
        super(token);
    }

    @Override
    public void process(TokenStack stack) {

        stack.pushTerm(new SymbolicVariable(new Symbol(this.getToken())));
    }
}
