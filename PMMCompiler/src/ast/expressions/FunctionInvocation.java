package ast.expressions;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private List<Expression> expressions;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "expression=" + expressions +
                ", variable=" + variable +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
