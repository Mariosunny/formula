package formula.operator.operator;

import formula.Symbol;
import formula.expression.Expression;
import formula.expression.Variable;
import formula.operator.UnaryOperator;

import java.util.HashMap;

/**
 * Created by tyler on 3/29/17.
 */
public class NegationOperator extends UnaryOperator {

    private final static Symbol SYMBOL = new Symbol("-");

    @Override
    public Symbol getSymbol() {
        return SYMBOL;
    }

    @Override
    public double calculate(HashMap<Variable, Double> values, Expression[] expressions) {

        return -expressions[0].calculate(values);
    }
}
