package formula.parser;


import formula.parser.token.Token;
import formula.parser.token.TokenPattern;

import java.util.regex.Matcher;

/**
 * Created by tyler on 4/1/17.
 */
public class Tokenizer {

    private String expression;

    public Tokenizer(String expression) {
        this.expression = expression.replaceAll("\\s+","");
    }

    public Token next() {

        Matcher matcher;

        if(!this.hasNext()) {

            throw new IllegalStateException("Nothing to tokenize.");
        }

        for(TokenPattern tokenDefinition: TokenPattern.values()) {

            matcher = tokenDefinition.getMatcher(this.expression);

            if(matcher.find() && matcher.start() == 0) {

                this.expression = this.expression.substring(matcher.end());
                return tokenDefinition.createToken(matcher.group());
            }
        }

        throw new IllegalStateException("Expression contains invalid token.");
    }

    public boolean hasNext() {

        return !this.expression.isEmpty();
    }
}
