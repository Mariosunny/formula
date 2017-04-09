package formula.parser;


import formula.Formula;
import formula.expression.Expression;
import formula.expression.OperatorExpression;
import formula.operator.Op;
import formula.parser.token.nonterm.parenthesis.ParenthesisToken;

/**
 * Created by tyler on 4/1/17.
 */
public class Parser {

    public static Formula parse(String expression) {

        return new Parser(expression).parse();
    }

    private final TokenStack stack;
    private final Tokenizer tokenizer;

    public Parser(String expression) {

        this.stack = new TokenStack();
        this.tokenizer = new Tokenizer(expression);
    }

    public Formula parse() {

        while(this.tokenizer.hasNext()) {

            this.tokenizer.next().process(this.stack);
        }

        if(stack.containsOperator() && stack.peekOperator() instanceof ParenthesisToken) {

            throw new IllegalStateException("Mismatched parentheses.");
        }

        while(stack.containsOperator()) {

            stack.peekOperator().parse(this.stack);
        }

        while(stack.getNumberOfTerms() > 1) {

            stack.pushTerm(new OperatorExpression(Op.MULTIPLICATION, new Expression[] {stack.popTerm(), stack.popTerm()}));
        }

        return new Formula(stack.popTerm());
    }
}
