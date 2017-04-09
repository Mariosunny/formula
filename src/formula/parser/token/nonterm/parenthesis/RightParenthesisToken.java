package formula.parser.token.nonterm.parenthesis;


import formula.parser.TokenStack;
import formula.parser.token.nonterm.NonTermToken;

/**
 * Created by tyler on 4/2/17.
 */
public class RightParenthesisToken extends ParenthesisToken {

    @Override
    public void process(TokenStack stack) {

        NonTermToken topOperator = stack.peekOperator();

        while(!(topOperator instanceof LeftParenthesisToken)) {

            topOperator.parse(stack);

            if(!stack.containsOperator()) {

                throw new IllegalStateException("Mismatched parentheses.");
            }

            topOperator = stack.peekOperator();
        }

        stack.popOperator();
    }
}
