package formula.parser;

import formula.expression.Expression;
import formula.parser.token.nonterm.NonTermToken;

import java.util.Stack;

/**
 * Created by tyler on 4/2/17.
 */
public class TokenStack {

    private final Stack<NonTermToken> operatorStack;
    private final Stack<Expression> termStack;

    public TokenStack() {
        this.operatorStack = new Stack<>();
        this.termStack = new Stack<>();
    }

    public boolean containsOperator() {

        return !this.operatorStack.isEmpty();
    }

    public boolean containsTerm() {

        return !this.termStack.isEmpty();
    }

    public int getNumberOfOperators() {

        return this.operatorStack.size();
    }

    public int getNumberOfTerms() {

        return this.termStack.size();
    }

    public NonTermToken peekOperator() {

        return this.operatorStack.peek();
    }

    public NonTermToken popOperator() {

        return this.operatorStack.pop();
    }

    public void pushOperator(NonTermToken token) {

        this.operatorStack.push(token);
    }

    public Expression popTerm() {

        return this.termStack.pop();
    }

    public void pushTerm(Expression term) {

        this.termStack.add(term);
    }
}
