package formula;

/**
 * Created by tyler on 3/1/17.
 * Encapsulates a string, representing a symbol in an expression (ex. "x", "+", etc.)
 */
public class Symbol {

    private final String symbol;

    public Symbol(String symbol) {

        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {

        return this.getSymbol();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symbol)) return false;

        Symbol symbol1 = (Symbol) o;

        return symbol.equals(symbol1.symbol);
    }

    @Override
    public int hashCode() {
        return symbol.hashCode();
    }
}
