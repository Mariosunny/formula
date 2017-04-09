package formula.operator.operator;


import formula.Symbol;
import formula.expression.Expression;
import formula.expression.Variable;
import formula.operator.BinaryOperator;

import java.util.HashMap;

/**
 * Created by tyler on 3/28/17.
 */
public class AndOperator extends BinaryOperator {

    private final static Symbol SYMBOL = new Symbol("&&");

    @Override
    public Symbol getSymbol() {

        return SYMBOL;
    }

    @Override
    public double calculate(HashMap<Variable, Double> values, Expression[] expressions) {

        if((expressions[0].calculate(values) != Expression.FALSE) && (expressions[1].calculate(values) != Expression.FALSE)) {

            return Expression.TRUE;
        }

        return Expression.FALSE;
    }

    @Override
    public boolean isCommutative() {

        return true;
    }
}
