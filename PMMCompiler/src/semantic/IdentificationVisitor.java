package semantic;

import ast.Definition;
import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private SymbolTable table = new SymbolTable();

    /* Definitions */
    @Override
    public Void visit(FunctionDefinition ast, Void p) {
        if (!table.insert(ast)) {
            new ErrorType(ast.getLine(), ast.getLine(), "Function " + ast.getName() + " has already been defined");
        }
        table.set();
        ast.getType().accept(this, p);
        for (VariableDefinition v : ast.getVarDefinitions()) {
            v.accept(this, p);
        }
        for (Statement s : ast.getStatements()) {
            s.accept(this, p);
        }
        table.reset();
        return null;
    }

    @Override
    public Void visit(VariableDefinition ast, Void p) {
        if (!table.insert(ast)) {
            new ErrorType(ast.getLine(), ast.getLine(), "Variable " + ast.getName() + " has already been defined");
        }
        ast.getType().accept(this, p);
        return null;
    }

    /* Expression */
    @Override
    public Void visit(Variable ast, Void p) {
        Definition varDef = table.find(ast.getName());
        if (varDef == null) {
            varDef = new VariableDefinition(0, 0,
                    new ErrorType(ast.getLine(), ast.getColumn(), "Variable " + ast.getName() + " hasn't been defined"), ast.getName());
        }
        ast.setDefinition(varDef);
        return null;
    }
}
