package formula.expression;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by tyler on 2/28/17.
 */
public interface Expression {

    public final static double TRUE = 1.0;
    public final static double FALSE = 0.0;

    public double calculate(HashMap<Variable, Double> values);
    public HashSet<Variable> getVariables();
    public Expression reduce();
    public boolean canReduce();
}
