package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class UnaryMinus extends AbstractUnaryExpression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "UnaryMinus{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
