package formula.parser.token.nonterm;

import formula.expression.Expression;
import formula.expression.OperatorExpression;
import formula.operator.Op;

/**
 * Created by tyler on 4/8/17.
 */
public class FloorToken extends UnaryOperatorToken {
    @Override
    public boolean isLeftAssociative() {
        return true;
    }

    @Override
    public Expression generateExpression(Expression[] expressions) {

        return new OperatorExpression(Op.FLOOR, expressions);
    }
}
