package formula.parser.token.nonterm.parenthesis;


import formula.parser.TokenStack;
import formula.parser.token.nonterm.NonTermToken;
import formula.parser.token.nonterm.OperatorToken;

/**
 * Created by tyler on 4/2/17.
 */
public abstract class ParenthesisToken implements NonTermToken {

    @Override
    public boolean isOperator() {
        return false;
    }

    @Override
    public boolean shouldPop(OperatorToken operatorToken) {
        return false;
    }

    @Override
    public void parse(TokenStack parser) {}
}
