package ast.expressions;

import ast.Expression;

public class StructAccess extends AbstractUnaryExpression {
    private String name;

    public StructAccess(int line, int column, Expression expression, String name) {
        super(line, column, expression);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StructAccess{" +
                "name='" + name + '\'' +
                ", expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
