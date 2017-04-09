package formula.operator;

import formula.Symbol;
import formula.expression.Expression;

/**
 * Created by tyler on 2/28/17.
 */
public abstract class BinaryOperator extends MultipleOperator {

    public abstract Symbol getSymbol();

    @Override
    public String getExpressionString(Expression[] expressions) {

        return "(" + expressions[0] + this.getSymbol() + expressions[1] + ")";
    }
}
