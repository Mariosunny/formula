package formula.parser.token;

import formula.expression.Expression;
import formula.parser.token.nonterm.*;
import formula.parser.token.nonterm.parenthesis.LeftParenthesisToken;
import formula.parser.token.nonterm.parenthesis.RightParenthesisToken;
import formula.parser.token.term.ConstantToken;
import formula.parser.token.term.VariableToken;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tyler on 4/2/17.
 */
public enum TokenPattern {

    TRUE("true") {
        @Override
        public Token createToken(String string) {
            return new ConstantToken(Expression.TRUE + "");
        }
    },
    FALSE("false") {
        @Override
        public Token createToken(String string) {
            return new ConstantToken(Expression.FALSE + "");
        }
    },
    VARIABLE("[a-zA-Z_\\$][a-zA-Z\\d_\\$]*") {
        @Override
        public Token createToken(String string) {
            return new VariableToken(string);
        }
    },
    CONSTANT("-?\\d+(?:\\.\\d+)?") {
        @Override
        public Token createToken(String string) {
            return new ConstantToken(string);
        }
    },
    LEFT_PARENTHESIS("\\(") {
        @Override
        public Token createToken(String string) {
            return new LeftParenthesisToken();
        }
    },
    RIGHT_PARENTHESIS("\\)") {
        @Override
        public Token createToken(String string) {
            return new RightParenthesisToken();
        }
    },
    OR("\\|\\|") {
        @Override
        public Token createToken(String string) {
            return new OrToken();
        }
    },
    AND("&&") {
        @Override
        public Token createToken(String string) {
            return new AndToken();
        }
    },
    CEILING("\\~") {
        @Override
        public Token createToken(String string) {
            return new CeilingToken();
        }
    },
    FLOOR("\\@") {
        @Override
        public Token createToken(String string) {
            return new FloorToken();
        }
    },
    NOT("\\!") {
        @Override
        public Token createToken(String string) {
            return new NotToken();
        }
    },
    EXPONENTIATION("\\^") {
        @Override
        public Token createToken(String string) {
            return new ExponentiationToken();
        }
    },
    MULTIPLICATION("\\*") {
        @Override
        public Token createToken(String string) {
            return new MultiplicationToken();
        }
    },
    DIVISION("/") {
        @Override
        public Token createToken(String string) {
            return new DivisionToken();
        }
    },
    SUBTRACTION("-") {
        @Override
        public Token createToken(String string) {
            return new SubtractionToken();
        }
    },
    ADDITION("\\+") {
        @Override
        public Token createToken(String string) {
            return new AdditionToken();
        }
    };

    public final Pattern regex;

    TokenPattern(String regex) {
        this.regex = Pattern.compile(regex);
    }

    public Matcher getMatcher(String string) {

        return this.regex.matcher(string);
    }

    public abstract Token createToken(String string);
}
