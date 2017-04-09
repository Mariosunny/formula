package formula.expression;


import formula.operator.Operator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by tyler on 4/1/17.
 * One or more expressions bound by an operator.
 */
public class OperatorExpression implements Expression{

    private final Expression[] expressions;
    private final Operator operator;

    public OperatorExpression(Operator operator, Expression[] expressions) {
        this.expressions = expressions;
        this.operator = operator;
    }

    @Override
    public double calculate(HashMap<Variable, Double> values) {

        return this.getOperator().calculate(values, this.expressions);
    }

    @Override
    public Expression reduce() {

        if(this.canReduce()) {

            return new Constant(this.calculate(new HashMap<Variable, Double>()));
        }

        return this;
    }

    @Override
    public boolean canReduce() {

        boolean canReduce = true;

        for(Expression expression:expressions) {

            canReduce = canReduce && expression.canReduce();
        }

        return canReduce;
    }

    @Override
    public HashSet<Variable> getVariables() {

        HashSet<Variable> variables = new HashSet<>();

        for(Expression expression:expressions) {

            variables.addAll(expression.getVariables());
        }

        return variables;
    }

    public Operator getOperator() {
        return operator;
    }

    @Override
    public String toString() {

        return this.getOperator().getExpressionString(this.expressions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OperatorExpression)) return false;

        OperatorExpression that = (OperatorExpression) o;

        return this.operator.areEqual(this.expressions, that.expressions);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(expressions);
        result = 31 * result + operator.hashCode();
        return result;
    }
}
