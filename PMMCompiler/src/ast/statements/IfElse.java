package ast.statements;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class IfElse extends AbstractUnaryExpressionStatement {
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public IfElse(int line, int column, Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line, column, condition);
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }

    @Override
    public String toString() {
        return "IfElse{" +
                "ifBody=" + ifBody +
                ", elseBody=" + elseBody +
                ", expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
