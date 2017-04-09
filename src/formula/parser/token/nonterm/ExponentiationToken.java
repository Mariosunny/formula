package formula.parser.token.nonterm;


import formula.expression.Expression;
import formula.expression.OperatorExpression;
import formula.operator.Op;

/**
 * Created by tyler on 4/2/17.
 */
public class ExponentiationToken extends BinaryOperatorToken {

    @Override
    public boolean isLeftAssociative() {
        return false;
    }

    @Override
    public int getPrecedence() {
        return 5;
    }

    @Override
    public Expression generateExpression(Expression[] expressions) {

        return new OperatorExpression(Op.EXPONENTIATION, expressions);
    }
}
