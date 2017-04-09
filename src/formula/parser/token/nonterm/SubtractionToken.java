package formula.parser.token.nonterm;

import formula.expression.Constant;
import formula.expression.Expression;
import formula.expression.OperatorExpression;
import formula.operator.Op;
import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public class SubtractionToken extends BinaryOperatorToken {

    @Override
    public boolean isLeftAssociative() {
        return true;
    }

    @Override
    public int getPrecedence() {
        return 3;
    }

    @Override
    public Expression generateExpression(Expression[] expressions) {

        return new OperatorExpression(Op.SUBTRACTION, expressions);
    }

    @Override
    public void parse(TokenStack stack) {

        // for handling unary version of this token
        if(stack.getNumberOfTerms() == 1) {

            Expression topExpression = stack.popTerm();
            stack.pushTerm(new Constant(0));
            stack.pushTerm(topExpression);
        }

        super.parse(stack);
    }
}
