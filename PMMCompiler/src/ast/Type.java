package ast;

import java.util.List;

public interface Type extends ASTNode {
    Type arithmetic(Type other, ASTNode ast);

    Type arithmetic(ASTNode ast);

    Type comparison(Type other, ASTNode ast);

    Type logical(Type other, ASTNode ast);

    Type logical(ASTNode ast);

    Type squareBrackets(Type other, ASTNode ast);

    Type canBeCastTo(Type other, ASTNode ast);

    Type parenthesis(List<Type> others, ASTNode ast);

    Type dot(String id, ASTNode ast);

    Type promotesTo(Type other, ASTNode ast);

    Type asLogical(Type other, ASTNode ast);

    boolean isLogical(ASTNode ast);

    Type asBuiltInType(Type other, ASTNode ast);

    boolean isBuiltInType(ASTNode ast);

    int numberOfBytes();

    char suffix();
}
