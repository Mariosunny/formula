package formula.operator.operator;


import formula.Symbol;
import formula.expression.Expression;
import formula.expression.Variable;
import formula.operator.UnaryOperator;

import java.util.HashMap;

/**
 * Created by tyler on 4/1/17.
 */
public class FloorOperator extends UnaryOperator {

    private final static Symbol SYMBOL = new Symbol("@");

    @Override
    public double calculate(HashMap<Variable, Double> values, Expression[] expressions) {

        return Math.floor(expressions[0].calculate(values));
    }

    @Override
    public Symbol getSymbol() {

        return SYMBOL;
    }
}
