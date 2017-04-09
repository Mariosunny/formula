package formula;


import formula.expression.Expression;
import formula.expression.Variable;

import java.util.HashMap;
import java.util.HashSet;


/**
 * Created by tyler on 3/27/17.
 */
public class Formula {

    private final Expression expression;

    public Formula(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public double calculate(HashMap<Variable, Double> values) {

        return this.getExpression().calculate(values);
    }

    public HashSet<Variable> getVariables() {

        return this.expression.getVariables();
    }

    public Formula reduce() {

        return new Formula(expression.reduce());
    }

    @Override
    public String toString() {

        return this.getExpression().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Formula)) return false;

        Formula formula = (Formula) o;

        return expression.equals(formula.expression);
    }

    @Override
    public int hashCode() {
        return expression.hashCode();
    }
}
