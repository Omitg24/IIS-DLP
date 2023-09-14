package ast.expressions;

import ast.Expression;
import ast.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private List<Expression> expression;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> expression, Variable variable) {
        super(line, column);
        this.expression = expression;
        this.variable = variable;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public Variable getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "expression=" + expression +
                ", variable=" + variable +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
