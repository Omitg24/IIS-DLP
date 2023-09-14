package ast.statements;

import ast.Expression;

public class Input extends AbstractUnaryExpressionStatement {
    public Input(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "Input{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
