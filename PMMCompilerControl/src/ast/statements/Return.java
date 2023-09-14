package ast.statements;

import ast.Expression;

public class Return extends AbstractUnaryExpressionStatement {
    public Return(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "Return{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
