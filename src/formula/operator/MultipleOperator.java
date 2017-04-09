package formula.operator;


import formula.expression.Expression;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by tyler on 4/8/17.
 */
public abstract class MultipleOperator implements Operator{

    @Override
    public boolean areEqual(Expression[] expressions1, Expression[] expressions2) {

        if(!this.isCommutative()) {

            return Arrays.equals(expressions1, expressions2);
        }

        HashSet<Expression> set1 = new HashSet<>(Arrays.asList(expressions1));
        HashSet<Expression> set2 = new HashSet<>(Arrays.asList(expressions2));

        return set1.equals(set2);
    }

    public boolean isCommutative() {

        return false;
    }
}
