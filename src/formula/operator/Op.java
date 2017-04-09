package formula.operator;

import formula.operator.operator.*;

/**
 * Created by tyler on 3/27/17.
 * Convenience interface for operators.
 */
public class Op {

    public final static AdditionOperator ADDITION = new AdditionOperator();
    public final static SubtractionOperator SUBTRACTION = new SubtractionOperator();
    public final static MultiplicationOperator MULTIPLICATION = new MultiplicationOperator();
    public final static DivisionOperator DIVISION = new DivisionOperator();
    public final static ExponentiationOperator EXPONENTIATION = new ExponentiationOperator();
    public final static NegationOperator NEGATION = new NegationOperator();
    public final static FloorOperator FLOOR = new FloorOperator();
    public final static CeilingOperator CEILING = new CeilingOperator();

    public final static OrOperator OR = new OrOperator();
    public final static AndOperator AND = new AndOperator();
    public final static NotOperator NOT = new NotOperator();
    public final static ConditionalOperator CONDITIONAL = new ConditionalOperator();

    private Op() {}
}
