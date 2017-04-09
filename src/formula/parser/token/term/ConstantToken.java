package formula.parser.token.term;


import formula.expression.Constant;
import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public class ConstantToken extends TermToken {

    public ConstantToken(String token) {
        super(token);
    }

    @Override
    public void process(TokenStack stack) {

        stack.pushTerm(new Constant(Double.parseDouble(this.getToken())));
    }
}
