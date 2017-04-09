package formula.parser.token.term;


import formula.parser.token.Token;

/**
 * Created by tyler on 4/2/17.
 */
public abstract class TermToken implements Token {

    private final String token;

    public TermToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
