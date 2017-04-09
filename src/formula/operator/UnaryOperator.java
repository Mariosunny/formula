package formula.operator;


import formula.Symbol;
import formula.expression.Expression;

/**
 * Created by tyler on 3/29/17.
 */
public abstract class UnaryOperator implements Operator {

    public abstract Symbol getSymbol();

    @Override
    public String getExpressionString(Expression[] expressions) {

        return "" + this.getSymbol() + expressions[0];
    }

    @Override
    public boolean areEqual(Expression[] expressions1, Expression[] expressions2) {

        return expressions1[0].equals(expressions2[0]);
    }
}
