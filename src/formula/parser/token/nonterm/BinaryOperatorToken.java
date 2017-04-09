package formula.parser.token.nonterm;

/**
 * Created by tyler on 4/2/17.
 */
public abstract class BinaryOperatorToken extends OperatorToken {

    @Override
    public int getNumberOfOperands() {
        return 2;
    }
}
