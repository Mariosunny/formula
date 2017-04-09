package formula.expression;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by tyler on 2/28/17.
 */
public class Constant implements Expression{

    private final double number;

    public Constant(int number) {

        this((double) number);
    }

    public Constant(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public Expression reduce() {

        return this;
    }

    @Override
    public boolean canReduce() {
        return true;
    }

    @Override
    public double calculate(HashMap<Variable, Double> values) {

        return this.getNumber();
    }

    @Override
    public String toString() {

        if(Math.floor(this.getNumber()) == this.getNumber()) {

            return "" + ((int) this.getNumber());
        }

        return "" + this.getNumber();
    }

    @Override
    public HashSet<Variable> getVariables() {

        return new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constant)) return false;

        Constant constant = (Constant) o;

        return Double.compare(constant.number, number) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(number);
        return (int) (temp ^ (temp >>> 32));
    }
}
