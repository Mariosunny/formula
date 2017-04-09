package formula.parser.token.nonterm;


import formula.parser.TokenStack;
import formula.parser.token.Token;

/**
 * Created by tyler on 4/2/17.
 */
public interface NonTermToken extends Token {

    public abstract boolean isOperator();
    public abstract boolean shouldPop(OperatorToken operatorToken);
    public abstract void parse(TokenStack parser);
}
