package ast.definitions;

import ast.Statement;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> statements;

    private List<VariableDefinition> varDefinitions;

    private int bytesLocals;

    public FunctionDefinition(int line, int column, Type type, String name, List<VariableDefinition> variableDefinitions, List<Statement> statements) {
        super(line, column, type, name);
        this.varDefinitions = variableDefinitions;
        this.statements = statements;
    }

    public List<VariableDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public int getBytesLocals() {
        return bytesLocals;
    }

    public void setBytesLocals(int bytesLocals) {
        this.bytesLocals = bytesLocals;
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" +
                "statements=" + statements +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", bytesLocals=" + bytesLocals +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
