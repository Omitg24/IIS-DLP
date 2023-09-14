package ast.statements;

import ast.Expression;

public class Print extends AbstractUnaryExpressionStatement {
    public Print(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "Print{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
