package ast;

public interface Definition extends ASTNode {
    Type getType();

    String getName();
}
