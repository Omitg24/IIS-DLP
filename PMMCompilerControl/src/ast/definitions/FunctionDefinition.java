package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> statements;

    public FunctionDefinition(int line, int column, Type type, String name, List<Statement> statements) {
        super(line, column, type, name);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" +
                "statements=" + statements +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
