package formula.operator;


import formula.expression.Expression;
import formula.expression.Variable;

import java.util.HashMap;

/**
 * Created by tyler on 3/29/17.
 */
public interface Operator {

    public abstract double calculate(HashMap<Variable, Double> values, Expression[] expressions);

    public abstract String getExpressionString(Expression[] expressions);

    public abstract boolean areEqual(Expression[] expressions1, Expression[] expressions2);
}
