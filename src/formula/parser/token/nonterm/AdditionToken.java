package formula.parser.token.nonterm;


import formula.expression.Expression;
import formula.expression.OperatorExpression;
import formula.operator.Op;

/**
 * Created by tyler on 4/2/17.
 */
public class AdditionToken extends BinaryOperatorToken {

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

        return new OperatorExpression(Op.ADDITION, expressions);
    }
}
