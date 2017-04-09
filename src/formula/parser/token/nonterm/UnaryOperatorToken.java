package formula.parser.token.nonterm;


import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public abstract class UnaryOperatorToken extends OperatorToken {

    @Override
    public int getNumberOfOperands() {
        return 1;
    }

    @Override
    public int getPrecedence() {

        return 6;
    }

    @Override
    public void process(TokenStack stack) {

        if(stack.containsOperator() && stack.containsTerm()) {

            NonTermToken topOperatorToken = stack.peekOperator();

            while (stack.containsOperator() && topOperatorToken.shouldPop(this)) {

                topOperatorToken.parse(stack);
                topOperatorToken = stack.peekOperator();
            }
        }

        stack.pushOperator(this);
    }
}
