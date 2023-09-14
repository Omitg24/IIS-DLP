package ast.statements;

import ast.Expression;
import ast.Statement;

import java.util.List;

public class While extends AbstractUnaryExpressionStatement {
    private List<Statement> statements;

    public While(int line, int column, Expression condition, List<Statement> statements) {
        super(line, column, condition);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "While{" +
                "statements=" + statements +
                ", expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
