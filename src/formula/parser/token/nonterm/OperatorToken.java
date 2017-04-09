package formula.parser.token.nonterm;

import formula.expression.Expression;
import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public abstract class OperatorToken implements NonTermToken {

    public abstract boolean isLeftAssociative();
    public abstract int getPrecedence();
    public abstract Expression generateExpression(Expression[] expressions);
    public abstract int getNumberOfOperands();

    @Override
    public boolean isOperator() {
        return true;
    }

    @Override
    public boolean shouldPop(OperatorToken currentToken) {

        return (currentToken.isLeftAssociative() && currentToken.getPrecedence() <= this.getPrecedence()) ||
                (!currentToken.isLeftAssociative() && currentToken.getPrecedence() < this.getPrecedence());
    }

    @Override
    public void process(TokenStack stack) {

        if(stack.containsOperator()) {

            NonTermToken topOperatorToken = stack.peekOperator();

            while (topOperatorToken.shouldPop(this)) {

                topOperatorToken.parse(stack);

                if(!stack.containsOperator()) {

                    break;
                }

                topOperatorToken = stack.peekOperator();
            }
        }

        stack.pushOperator(this);
    }

    public void parse(TokenStack parser) {

        parser.popOperator();
        int numberOfOperands = this.getNumberOfOperands();
        Expression[] expressions = new Expression[numberOfOperands];

        for(int i = numberOfOperands - 1; i >= 0;i--) {

            expressions[i] = parser.popTerm();
        }

        parser.pushTerm(this.generateExpression(expressions));
    }
}
