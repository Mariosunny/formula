package formula.operator.operator;


import formula.Symbol;
import formula.expression.Expression;
import formula.expression.Variable;
import formula.operator.BinaryOperator;

import java.util.HashMap;

/**
 * Created by tyler on 3/1/17.
 */
public class MultiplicationOperator extends BinaryOperator {

    private final static Symbol SYMBOL = new Symbol("*");

    @Override
    public double calculate(HashMap<Variable, Double> values, Expression[] expressions) {

        return expressions[0].calculate(values) * expressions[1].calculate(values);
    }

    public Symbol getSymbol() {

        return SYMBOL;
    }

    @Override
    public boolean isCommutative() {

        return true;
    }
}
