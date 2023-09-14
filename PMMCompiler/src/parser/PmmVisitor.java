// Generated from java-escape by ANTLR 4.11.1
package parser;

/* El contenido va a ser copiado en PmmParser */

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link PmmParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(PmmParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#main}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMain(PmmParser.MainContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(PmmParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(PmmParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(PmmParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#structFields}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStructFields(PmmParser.StructFieldsContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#variableDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableDefinition(PmmParser.VariableDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#functionDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionDefinition(PmmParser.FunctionDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#functionInvocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionInvocation(PmmParser.FunctionInvocationContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBody(PmmParser.BodyContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#expressions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpressions(PmmParser.ExpressionsContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#params}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParams(PmmParser.ParamsContext ctx);

    /**
     * Visit a parse tree produced by {@link PmmParser#ids}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIds(PmmParser.IdsContext ctx);
}