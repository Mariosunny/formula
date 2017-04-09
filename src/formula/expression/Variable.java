package formula.expression;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by tyler on 3/29/17.
 */
public abstract class Variable implements Expression{

    @Override
    public Expression reduce() {

        return this;
    }

    @Override
    public boolean canReduce() {
        return false;
    }

    @Override
    public double calculate(HashMap<Variable, Double> values) {

        return values.get(this);
    }

    @Override
    public HashSet<Variable> getVariables() {

        HashSet<Variable> variables = new HashSet<>();

        variables.add(this);

        return variables;
    }
}
