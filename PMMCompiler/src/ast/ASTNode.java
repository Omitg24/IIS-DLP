package ast;

import visitor.Visitor;

public interface ASTNode {
    int getLine();

    int getColumn();

    <TP, TR> TR accept(Visitor<TP, TR> v, TP p);
}
