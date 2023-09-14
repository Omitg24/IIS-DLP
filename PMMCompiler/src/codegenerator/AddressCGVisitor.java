package codegenerator;

import ast.definitions.VariableDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.StructAccess;
import ast.expressions.Variable;
import ast.types.IntType;
import ast.types.StructType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    private CodeGenerator cg;

    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Void visit(ArrayAccess ast, Void p) {
//        address[[ArrayAccess: expression1 -> expression2 expression2]]() =
//            address[[expression2]]
//            value[[expression3]]
//            <pushi> expression1.type.numberOfBytes
//            <muli>
//            <addi>
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this.valueCGVisitor, p);
        this.cg.push(ast.getType().numberOfBytes());
        this.cg.mul(IntType.getInstance());
        this.cg.add(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(StructAccess ast, Void p) {
//        address[[StructAccess: expression1 -> expression2 ID]]() =
//            address[[expression2]]
//            <pushi> expression2.type.getField(expression1.getName()).getOffset()
//            <addi>
        ast.getExpression().accept(this, p);
        this.cg.push(((StructType) ast.getExpression().getType()).getField(ast.getName()).getOffset());
        this.cg.add(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Variable ast, Void p) {
//        address[[Variable: expression -> ID]]() =
//            if (expression.definition.scope==0) {
//                <pusha> expression.definition.offset
//            } else {
//                <push bp>
//                <pushi> expression.definition.offset
//                <addi>
//            }
        if (ast.getDefinition().getScope() == 0) {
            this.cg.pusha(((VariableDefinition) ast.getDefinition()).getOffset());
        } else {
            this.cg.pushBP();
            this.cg.push(((VariableDefinition) ast.getDefinition()).getOffset());
            this.cg.add(IntType.getInstance());
        }
        return null;
    }
}
