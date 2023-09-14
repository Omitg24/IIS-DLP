package ast;

public interface Expression extends ASTNode {
    boolean getLValue();

    void setLValue(boolean lvalue);

    Type getType();

    void setType(Type type);
}