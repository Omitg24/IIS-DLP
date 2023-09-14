package ast.statements;

import ast.Expression;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
