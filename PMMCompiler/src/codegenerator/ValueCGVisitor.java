package codegenerator;

import ast.expressions.*;
import ast.types.FunctionType;
import ast.types.IntType;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
    private CodeGenerator cg;

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Void visit(Arithmetic ast, Void p) {
//        value[[Arithmetic: expression1 -> expression2 (+|-|*|/|%) expression3]]() =
//            value[[expression2]]()
//            cg.convertTo(expression2.type, expression1.type)
//            value[[expression3]]()
//            cg.convertTo(expression3.type, expression1.type)
//            cg.arithmetic(expression1.operator, expression1.type)
        ast.getLeft().accept(this, p);
        this.cg.convertTo(ast.getLeft().getType(), ast.getType());
        ast.getRight().accept(this, p);
        this.cg.convertTo(ast.getRight().getType(), ast.getType());
        this.cg.arithmetic(ast.getOperator(), ast.getType());
        return null;
    }

    @Override
    public Void visit(ArrayAccess ast, Void p) {
//        value[[ArrayAccess: expression1 -> expression2 expression3]]() =
//            address[[expression1]]
//            <load> expression1.type.suffix()
        ast.accept(this.addressCGVisitor, p);
        this.cg.load(ast.getType());
        return null;
    }

    @Override
    public Void visit(Cast ast, Void p) {
//        value[[Cast: expression1-> type expression2]]() =
//            value[[expression2]]
//            cg.convertTo(expression2.type, type);
        ast.getExpression().accept(this, p);
        this.cg.convertTo(ast.getExpression().getType(), ast.getType());
        return null;
    }

    @Override
    public Void visit(CharLiteral ast, Void p) {
//        value[[CharLiteral: expression -> CHAR_CONSTANT]]() =
//            <pushb> CHAR_CONSTANT
        this.cg.push(ast.getValue());
        return null;
    }

    @Override
    public Void visit(Comparison ast, Void p) {
//        value[[Comparison: expression1 -> expression2 (==|!=|>=|<=|>|<) expression3]]() =
//            value[[expression2]]()
//            cg.convertTo(expression2.type, expression1.type)
//            value[[expression3]]()
//            cg.convertTo(expression3.type, expression1.type)
//            cg.comparison(expression1.operator, expression1.type)
        ast.getLeft().accept(this, p);
        this.cg.convertTo(ast.getLeft().getType(), ast.getType());
        ast.getRight().accept(this, p);
        this.cg.convertTo(ast.getRight().getType(), ast.getType());
        cg.comparison(ast.getOperator(), ast.getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation ast, Void p) {
//        value[[FunctionInvocation: expression1 -> expression2 expression3*]]() =
//            for (int i = 0; i < ast.getExpressions().size(); i++) {
//                ast.getExpressions().get(i).accept(this, p);
//                this.cg.convertTo(ast.getExpressions().get(i).getType(),
//                     ((FunctionType) ast.getVariable().getDefinition().getType()).getVarDefinitions().get(i).getType());
//            }
//            expression2.definition.type.varDefinitions
//            <call> expression2.name
        for (int i = 0; i < ast.getExpressions().size(); i++) {
            ast.getExpressions().get(i).accept(this, p);
            this.cg.convertTo(ast.getExpressions().get(i).getType(),
                    ((FunctionType) ast.getVariable().getDefinition().getType()).getVarDefinitions().get(i).getType());
        }
        this.cg.call(ast.getVariable().getName());
        return null;
    }

    @Override
    public Void visit(IntLiteral ast, Void p) {
//        value[[IntLiteral: expression -> INT_CONSTANT]]() =
//            <pushi> INT_CONSTANT
        this.cg.push(ast.getValue());
        return null;
    }

    @Override
    public Void visit(Logical ast, Void p) {
//        value[[Logical: expression1 -> expression2 (&&|||) expression3]]() =
//            value[[expression2]]()
//            value[[expression3]]()
//            cg.logical(expression1.operator)
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this, p);
        this.cg.logical(ast.getOperator());
        return null;
    }

    @Override
    public Void visit(RealLiteral ast, Void p) {
//        value[[RealLiteral: expression -> REAL_CONSTANT]]() =
//            <pushf> REAL_CONSTANT
        this.cg.push(ast.getValue());
        return null;
    }

    @Override
    public Void visit(StructAccess ast, Void p) {
//        value[[StructAccess: expression1 -> expression2 ID]]() =
//            address[[expression1]]
//            <load> expression1.type.suffix()
        ast.accept(this.addressCGVisitor, p);
        this.cg.load(ast.getType());
        return null;
    }

    @Override
    public Void visit(UnaryMinus ast, Void p) {
//        value[[UnaryMinus: expression1 -> expression2]]() =
//            value[[expression2]]()
//            cg.convertTo(expression2.type, expression1.type)
//            <pushi> -1
//            cg.convertTo(IntType, expression1.type)
//            <mul> expression1.type.suffix()
        ast.getExpression().accept(this, p);
        this.cg.convertTo(ast.getExpression().getType(), ast.getType());
        this.cg.push(-1);
        this.cg.convertTo(IntType.getInstance(), ast.getType());
        this.cg.mul(ast.getType());
        return null;
    }

    @Override
    public Void visit(UnaryNot ast, Void p) {
//        value[[UnaryNot: expression1 -> expression2]]() =
//            value[[expression2]]()
//            cg.logical(expression1.operator)
        ast.getExpression().accept(this, p);
        this.cg.not();
        return null;
    }

    @Override
    public Void visit(Variable ast, Void p) {
//        value[[Variable: expression -> ID]]() =
//            address[[ID]]()
//            <load> expression.type.suffix()
        ast.accept(this.addressCGVisitor, p);
        this.cg.load(ast.getType());
        return null;
    }
}
