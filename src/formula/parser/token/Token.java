package formula.parser.token;

import formula.parser.TokenStack;

/**
 * Created by tyler on 4/2/17.
 */
public interface Token {

    public void process(TokenStack stack);
}
