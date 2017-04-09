package formula.expression;

import formula.Symbol;

/**
 * Created by tyler on 3/1/17.
 */
public class SymbolicVariable extends Variable {

    private final Symbol symbol;

    public SymbolicVariable(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {

        return "" + this.getSymbol();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SymbolicVariable)) return false;

        SymbolicVariable that = (SymbolicVariable) o;

        return symbol.equals(that.symbol);
    }

    @Override
    public int hashCode() {
        return symbol.hashCode();
    }
}
