package ast.statements;

import ast.Expression;
import visitor.Visitor;

public class Assignment extends AbstractStatement {
    private Expression left;
    private Expression right;

    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "left=" + left +
                ", right=" + right +
                ", line=" + line +
                ", column=" + column +
                '}';
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
