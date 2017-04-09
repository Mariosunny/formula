package formula.parser.token.nonterm.parenthesis;


import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public class LeftParenthesisToken extends ParenthesisToken {

    @Override
    public void process(TokenStack stack) {

        stack.pushOperator(this);
    }
}
