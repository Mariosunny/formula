package formula.operator.operator;


import formula.Symbol;
import formula.expression.Expression;
import formula.expression.Variable;
import formula.operator.BinaryOperator;

import java.util.HashMap;

/**
 * Created by tyler on 2/28/17.
 */
public class SubtractionOperator extends BinaryOperator {

    private final static Symbol SYMBOL = new Symbol("-");

    @Override
    public double calculate(HashMap<Variable, Double> values, Expression[] expressions) {

        return expressions[0].calculate(values) - expressions[1].calculate(values);
    }

    public Symbol getSymbol() {

        return SYMBOL;
    }
}
