package formula.operator.operator;


import formula.expression.Expression;
import formula.expression.Variable;
import formula.operator.TernaryOperator;

import java.util.HashMap;

/**
 * Created by tyler on 4/1/17.
 */
public class ConditionalOperator extends TernaryOperator {

    @Override
    public double calculate(HashMap<Variable, Double> values, Expression[] expressions) {

        if(expressions[0].calculate(values) != Expression.FALSE) {

            return expressions[1].calculate(values);
        }

        return expressions[2].calculate(values);
    }

    @Override
    public String getExpressionString(Expression[] expressions) {

        return "(" + expressions[0] + "?" + expressions[1] + ":" + expressions[2] + ")";
    }
}
