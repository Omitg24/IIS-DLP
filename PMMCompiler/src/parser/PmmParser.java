// Generated from java-escape by ANTLR 4.11.1
package parser;

/* El contenido va a ser copiado en PmmParser */

import ast.*;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36, T__36 = 37, TRASH = 38,
            COMMENT = 39, ID = 40, INT_CONSTANT = 41, CHAR_CONSTANT = 42, REAL_CONSTANT = 43;
    public static final int
            RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_expression = 3,
            RULE_type = 4, RULE_structFields = 5, RULE_variableDefinition = 6, RULE_functionDefinition = 7,
            RULE_functionInvocation = 8, RULE_body = 9, RULE_expressions = 10, RULE_params = 11,
            RULE_ids = 12;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0001+\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001" +
                    "@\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002c\b\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0003\u0002q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0092\b\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003" +
                    "\u00b2\b\u0003\n\u0003\f\u0003\u00b5\t\u0003\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c9\b\u0004\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004" +
                    "\u0005\u00d1\b\u0005\u000b\u0005\f\u0005\u00d2\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e0\b\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e7\b\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007" +
                    "\u00ee\b\u0007\n\u0007\f\u0007\u00f1\t\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0005\u0007\u00f6\b\u0007\n\u0007\f\u0007\u00f9\t\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003" +
                    "\b\u0103\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
                    "\t\u0001\t\u0001\t\u0005\t\u010f\b\t\n\t\f\t\u0112\t\t\u0001\t\u0003\t" +
                    "\u0115\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u011d" +
                    "\b\n\n\n\f\n\u0120\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0005\u000b\u0128\b\u000b\n\u000b\f\u000b\u012b" +
                    "\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0132\b\f\n\f" +
                    "\f\f\u0135\t\f\u0001\f\u0000\u0001\u0006\r\u0000\u0002\u0004\u0006\b\n" +
                    "\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000\u0015\u0017" +
                    "\u0002\u0000\u0013\u0013\u0018\u0018\u0001\u0000\u0019\u001e\u0001\u0000" +
                    "\u001f \u0151\u0000#\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000" +
                    "\u0000\u0004p\u0001\u0000\u0000\u0000\u0006\u0091\u0001\u0000\u0000\u0000" +
                    "\b\u00c8\u0001\u0000\u0000\u0000\n\u00d0\u0001\u0000\u0000\u0000\f\u00d4" +
                    "\u0001\u0000\u0000\u0000\u000e\u00d9\u0001\u0000\u0000\u0000\u0010\u00fd" +
                    "\u0001\u0000\u0000\u0000\u0012\u0114\u0001\u0000\u0000\u0000\u0014\u0116" +
                    "\u0001\u0000\u0000\u0000\u0016\u0121\u0001\u0000\u0000\u0000\u0018\u012c" +
                    "\u0001\u0000\u0000\u0000\u001a\u001b\u0003\f\u0006\u0000\u001b\u001c\u0005" +
                    "\u0001\u0000\u0000\u001c\u001d\u0006\u0000\uffff\uffff\u0000\u001d\"\u0001" +
                    "\u0000\u0000\u0000\u001e\u001f\u0003\u000e\u0007\u0000\u001f \u0006\u0000" +
                    "\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001a\u0001\u0000\u0000" +
                    "\u0000!\u001e\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001" +
                    "\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000" +
                    "%#\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005\u0000\u0000" +
                    "\u0001()\u0006\u0000\uffff\uffff\u0000)\u0001\u0001\u0000\u0000\u0000" +
                    "*+\u0005\u0002\u0000\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0004\u0000" +
                    "\u0000-.\u0005\u0005\u0000\u0000./\u0005\u0006\u0000\u0000/6\u0005\u0007" +
                    "\u0000\u000001\u0003\f\u0006\u000012\u0005\u0001\u0000\u000023\u0006\u0001" +
                    "\uffff\uffff\u000035\u0001\u0000\u0000\u000040\u0001\u0000\u0000\u0000" +
                    "58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000" +
                    "\u00007>\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0003\u0004" +
                    "\u0002\u0000:;\u0006\u0001\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000" +
                    "<9\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000" +
                    "\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000" +
                    "\u0000\u0000AB\u0005\b\u0000\u0000BC\u0006\u0001\uffff\uffff\u0000C\u0003" +
                    "\u0001\u0000\u0000\u0000DE\u0005\t\u0000\u0000EF\u0003\u0014\n\u0000F" +
                    "G\u0005\u0001\u0000\u0000GH\u0006\u0002\uffff\uffff\u0000Hq\u0001\u0000" +
                    "\u0000\u0000IJ\u0005\n\u0000\u0000JK\u0003\u0014\n\u0000KL\u0005\u0001" +
                    "\u0000\u0000LM\u0006\u0002\uffff\uffff\u0000Mq\u0001\u0000\u0000\u0000" +
                    "NO\u0005\u000b\u0000\u0000OP\u0003\u0006\u0003\u0000PQ\u0005\u0001\u0000" +
                    "\u0000QR\u0006\u0002\uffff\uffff\u0000Rq\u0001\u0000\u0000\u0000ST\u0003" +
                    "\u0006\u0003\u0000TU\u0005\f\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0005" +
                    "\u0001\u0000\u0000WX\u0006\u0002\uffff\uffff\u0000Xq\u0001\u0000\u0000" +
                    "\u0000YZ\u0005\r\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0005\u0006" +
                    "\u0000\u0000\\b\u0003\u0012\t\u0000]^\u0005\u000e\u0000\u0000^_\u0005" +
                    "\u0006\u0000\u0000_`\u0003\u0012\t\u0000`a\u0006\u0002\uffff\uffff\u0000" +
                    "ac\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000" +
                    "\u0000cd\u0001\u0000\u0000\u0000de\u0006\u0002\uffff\uffff\u0000eq\u0001" +
                    "\u0000\u0000\u0000fg\u0005\u000f\u0000\u0000gh\u0003\u0006\u0003\u0000" +
                    "hi\u0005\u0006\u0000\u0000ij\u0003\u0012\t\u0000jk\u0006\u0002\uffff\uffff" +
                    "\u0000kq\u0001\u0000\u0000\u0000lm\u0003\u0010\b\u0000mn\u0005\u0001\u0000" +
                    "\u0000no\u0006\u0002\uffff\uffff\u0000oq\u0001\u0000\u0000\u0000pD\u0001" +
                    "\u0000\u0000\u0000pI\u0001\u0000\u0000\u0000pN\u0001\u0000\u0000\u0000" +
                    "pS\u0001\u0000\u0000\u0000pY\u0001\u0000\u0000\u0000pf\u0001\u0000\u0000" +
                    "\u0000pl\u0001\u0000\u0000\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0006" +
                    "\u0003\uffff\uffff\u0000st\u0005(\u0000\u0000t\u0092\u0006\u0003\uffff" +
                    "\uffff\u0000uv\u0005)\u0000\u0000v\u0092\u0006\u0003\uffff\uffff\u0000" +
                    "wx\u0005*\u0000\u0000x\u0092\u0006\u0003\uffff\uffff\u0000yz\u0005+\u0000" +
                    "\u0000z\u0092\u0006\u0003\uffff\uffff\u0000{|\u0005\u0004\u0000\u0000" +
                    "|}\u0003\u0006\u0003\u0000}~\u0005\u0005\u0000\u0000~\u007f\u0006\u0003" +
                    "\uffff\uffff\u0000\u007f\u0092\u0001\u0000\u0000\u0000\u0080\u0081\u0003" +
                    "\u0010\b\u0000\u0081\u0082\u0006\u0003\uffff\uffff\u0000\u0082\u0092\u0001" +
                    "\u0000\u0000\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0003" +
                    "\b\u0004\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0003\u0006" +
                    "\u0003\u0007\u0087\u0088\u0006\u0003\uffff\uffff\u0000\u0088\u0092\u0001" +
                    "\u0000\u0000\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0003" +
                    "\u0006\u0003\u0006\u008b\u008c\u0006\u0003\uffff\uffff\u0000\u008c\u0092" +
                    "\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0014\u0000\u0000\u008e\u008f" +
                    "\u0003\u0006\u0003\u0005\u008f\u0090\u0006\u0003\uffff\uffff\u0000\u0090" +
                    "\u0092\u0001\u0000\u0000\u0000\u0091r\u0001\u0000\u0000\u0000\u0091u\u0001" +
                    "\u0000\u0000\u0000\u0091w\u0001\u0000\u0000\u0000\u0091y\u0001\u0000\u0000" +
                    "\u0000\u0091{\u0001\u0000\u0000\u0000\u0091\u0080\u0001\u0000\u0000\u0000" +
                    "\u0091\u0083\u0001\u0000\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000" +
                    "\u0091\u008d\u0001\u0000\u0000\u0000\u0092\u00b3\u0001\u0000\u0000\u0000" +
                    "\u0093\u0094\n\u0004\u0000\u0000\u0094\u0095\u0007\u0000\u0000\u0000\u0095" +
                    "\u0096\u0003\u0006\u0003\u0005\u0096\u0097\u0006\u0003\uffff\uffff\u0000" +
                    "\u0097\u00b2\u0001\u0000\u0000\u0000\u0098\u0099\n\u0003\u0000\u0000\u0099" +
                    "\u009a\u0007\u0001\u0000\u0000\u009a\u009b\u0003\u0006\u0003\u0004\u009b" +
                    "\u009c\u0006\u0003\uffff\uffff\u0000\u009c\u00b2\u0001\u0000\u0000\u0000" +
                    "\u009d\u009e\n\u0002\u0000\u0000\u009e\u009f\u0007\u0002\u0000\u0000\u009f" +
                    "\u00a0\u0003\u0006\u0003\u0003\u00a0\u00a1\u0006\u0003\uffff\uffff\u0000" +
                    "\u00a1\u00b2\u0001\u0000\u0000\u0000\u00a2\u00a3\n\u0001\u0000\u0000\u00a3" +
                    "\u00a4\u0007\u0003\u0000\u0000\u00a4\u00a5\u0003\u0006\u0003\u0002\u00a5" +
                    "\u00a6\u0006\u0003\uffff\uffff\u0000\u00a6\u00b2\u0001\u0000\u0000\u0000" +
                    "\u00a7\u00a8\n\t\u0000\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9" +
                    "\u00aa\u0003\u0006\u0003\u0000\u00aa\u00ab\u0005\u0011\u0000\u0000\u00ab" +
                    "\u00ac\u0006\u0003\uffff\uffff\u0000\u00ac\u00b2\u0001\u0000\u0000\u0000" +
                    "\u00ad\u00ae\n\b\u0000\u0000\u00ae\u00af\u0005\u0012\u0000\u0000\u00af" +
                    "\u00b0\u0005(\u0000\u0000\u00b0\u00b2\u0006\u0003\uffff\uffff\u0000\u00b1" +
                    "\u0093\u0001\u0000\u0000\u0000\u00b1\u0098\u0001\u0000\u0000\u0000\u00b1" +
                    "\u009d\u0001\u0000\u0000\u0000\u00b1\u00a2\u0001\u0000\u0000\u0000\u00b1" +
                    "\u00a7\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b2" +
                    "\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3" +
                    "\u00b4\u0001\u0000\u0000\u0000\u00b4\u0007\u0001\u0000\u0000\u0000\u00b5" +
                    "\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005!\u0000\u0000\u00b7\u00c9" +
                    "\u0006\u0004\uffff\uffff\u0000\u00b8\u00b9\u0005\"\u0000\u0000\u00b9\u00c9" +
                    "\u0006\u0004\uffff\uffff\u0000\u00ba\u00bb\u0005#\u0000\u0000\u00bb\u00c9" +
                    "\u0006\u0004\uffff\uffff\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd" +
                    "\u00be\u0005)\u0000\u0000\u00be\u00bf\u0005\u0011\u0000\u0000\u00bf\u00c0" +
                    "\u0003\b\u0004\u0000\u00c0\u00c1\u0006\u0004\uffff\uffff\u0000\u00c1\u00c9" +
                    "\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005$\u0000\u0000\u00c3\u00c4\u0005" +
                    "\u0007\u0000\u0000\u00c4\u00c5\u0003\n\u0005\u0000\u00c5\u00c6\u0005\b" +
                    "\u0000\u0000\u00c6\u00c7\u0006\u0004\uffff\uffff\u0000\u00c7\u00c9\u0001" +
                    "\u0000\u0000\u0000\u00c8\u00b6\u0001\u0000\u0000\u0000\u00c8\u00b8\u0001" +
                    "\u0000\u0000\u0000\u00c8\u00ba\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001" +
                    "\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c9\t\u0001\u0000" +
                    "\u0000\u0000\u00ca\u00cb\u0003\u0018\f\u0000\u00cb\u00cc\u0005\u0006\u0000" +
                    "\u0000\u00cc\u00cd\u0003\b\u0004\u0000\u00cd\u00ce\u0005\u0001\u0000\u0000" +
                    "\u00ce\u00cf\u0006\u0005\uffff\uffff\u0000\u00cf\u00d1\u0001\u0000\u0000" +
                    "\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000" +
                    "\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000" +
                    "\u0000\u00d3\u000b\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0018\f\u0000" +
                    "\u00d5\u00d6\u0005\u0006\u0000\u0000\u00d6\u00d7\u0003\b\u0004\u0000\u00d7" +
                    "\u00d8\u0006\u0006\uffff\uffff\u0000\u00d8\r\u0001\u0000\u0000\u0000\u00d9" +
                    "\u00da\u0005\u0002\u0000\u0000\u00da\u00db\u0005(\u0000\u0000\u00db\u00df" +
                    "\u0005\u0004\u0000\u0000\u00dc\u00dd\u0003\u0016\u000b\u0000\u00dd\u00de" +
                    "\u0006\u0007\uffff\uffff\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df" +
                    "\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0" +
                    "\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0005\u0000\u0000\u00e2" +
                    "\u00e6\u0005\u0006\u0000\u0000\u00e3\u00e4\u0003\b\u0004\u0000\u00e4\u00e5" +
                    "\u0006\u0007\uffff\uffff\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6" +
                    "\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7" +
                    "\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ef\u0005\u0007\u0000\u0000\u00e9" +
                    "\u00ea\u0003\f\u0006\u0000\u00ea\u00eb\u0005\u0001\u0000\u0000\u00eb\u00ec" +
                    "\u0006\u0007\uffff\uffff\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed" +
                    "\u00e9\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef" +
                    "\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0" +
                    "\u00f7\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2" +
                    "\u00f3\u0003\u0004\u0002\u0000\u00f3\u00f4\u0006\u0007\uffff\uffff\u0000" +
                    "\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000" +
                    "\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000" +
                    "\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000" +
                    "\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\b\u0000\u0000\u00fb" +
                    "\u00fc\u0006\u0007\uffff\uffff\u0000\u00fc\u000f\u0001\u0000\u0000\u0000" +
                    "\u00fd\u00fe\u0005(\u0000\u0000\u00fe\u0102\u0005\u0004\u0000\u0000\u00ff" +
                    "\u0100\u0003\u0014\n\u0000\u0100\u0101\u0006\b\uffff\uffff\u0000\u0101" +
                    "\u0103\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0102" +
                    "\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104" +
                    "\u0105\u0005\u0005\u0000\u0000\u0105\u0106\u0006\b\uffff\uffff\u0000\u0106" +
                    "\u0011\u0001\u0000\u0000\u0000\u0107\u0108\u0003\u0004\u0002\u0000\u0108" +
                    "\u0109\u0006\t\uffff\uffff\u0000\u0109\u0115\u0001\u0000\u0000\u0000\u010a" +
                    "\u0110\u0005\u0007\u0000\u0000\u010b\u010c\u0003\u0004\u0002\u0000\u010c" +
                    "\u010d\u0006\t\uffff\uffff\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e" +
                    "\u010b\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110" +
                    "\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111" +
                    "\u0113\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113" +
                    "\u0115\u0005\b\u0000\u0000\u0114\u0107\u0001\u0000\u0000\u0000\u0114\u010a" +
                    "\u0001\u0000\u0000\u0000\u0115\u0013\u0001\u0000\u0000\u0000\u0116\u0117" +
                    "\u0003\u0006\u0003\u0000\u0117\u011e\u0006\n\uffff\uffff\u0000\u0118\u0119" +
                    "\u0005%\u0000\u0000\u0119\u011a\u0003\u0006\u0003\u0000\u011a\u011b\u0006" +
                    "\n\uffff\uffff\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0118\u0001" +
                    "\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001" +
                    "\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0015\u0001" +
                    "\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0003" +
                    "\f\u0006\u0000\u0122\u0129\u0006\u000b\uffff\uffff\u0000\u0123\u0124\u0005" +
                    "%\u0000\u0000\u0124\u0125\u0003\f\u0006\u0000\u0125\u0126\u0006\u000b" +
                    "\uffff\uffff\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0123\u0001" +
                    "\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001" +
                    "\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0017\u0001" +
                    "\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005" +
                    "(\u0000\u0000\u012d\u0133\u0006\f\uffff\uffff\u0000\u012e\u012f\u0005" +
                    "%\u0000\u0000\u012f\u0130\u0005(\u0000\u0000\u0130\u0132\u0006\f\uffff" +
                    "\uffff\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000" +
                    "\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000" +
                    "\u0000\u0000\u0134\u0019\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000" +
                    "\u0000\u0000\u0015!#6>bp\u0091\u00b1\u00b3\u00c8\u00d2\u00df\u00e6\u00ef" +
                    "\u00f7\u0102\u0110\u0114\u011e\u0129\u0133";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public PmmParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "main", "statement", "expression", "type", "structFields",
                "variableDefinition", "functionDefinition", "functionInvocation", "body",
                "expressions", "params", "ids"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "'print'",
                "'input'", "'return'", "'='", "'if'", "'else'", "'while'", "'['", "']'",
                "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>'",
                "'>='", "'<'", "'<='", "'||'", "'&&'", "'char'", "'double'", "'int'",
                "'struct'", "','"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "TRASH", "COMMENT", "ID", "INT_CONSTANT", "CHAR_CONSTANT",
                "REAL_CONSTANT"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "java-escape";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(35);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            setState(33);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case ID: {
                                    setState(26);
                                    ((ProgramContext) _localctx).vd = variableDefinition();
                                    setState(27);
                                    match(T__0);
                                    _localctx.definitions.addAll(((ProgramContext) _localctx).vd.ast);
                                }
                                break;
                                case T__1: {
                                    setState(30);
                                    ((ProgramContext) _localctx).fd = functionDefinition();
                                    _localctx.definitions.add(((ProgramContext) _localctx).fd.ast);
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                    }
                    setState(37);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(38);
                ((ProgramContext) _localctx).m = main();
                setState(39);
                match(EOF);

                _localctx.definitions.add(((ProgramContext) _localctx).m.ast);
                ((ProgramContext) _localctx).ast = new Program(0, 0, _localctx.definitions);

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MainContext main() throws RecognitionException {
        MainContext _localctx = new MainContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_main);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(42);
                ((MainContext) _localctx).T = match(T__1);
                setState(43);
                match(T__2);
                setState(44);
                match(T__3);
                setState(45);
                match(T__4);
                setState(46);
                match(T__5);
                setState(47);
                match(T__6);
                setState(54);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(48);
                                ((MainContext) _localctx).vd = variableDefinition();
                                setState(49);
                                match(T__0);
                                _localctx.varDefinitions.addAll(((MainContext) _localctx).vd.ast);
                            }
                        }
                    }
                    setState(56);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
                setState(62);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492676034064L) != 0) {
                    {
                        {
                            setState(57);
                            ((MainContext) _localctx).st1 = statement();
                            _localctx.statements.addAll(((MainContext) _localctx).st1.ast);
                        }
                    }
                    setState(64);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(65);
                match(T__7);

                ((MainContext) _localctx).ast = new ast.definitions.FunctionDefinition(((MainContext) _localctx).T.getLine(), ((MainContext) _localctx).T.getCharPositionInLine() + 1,
                        new FunctionType(((MainContext) _localctx).T.getLine(), ((MainContext) _localctx).T.getCharPositionInLine() + 1,
                                new ArrayList<VariableDefinition>(), VoidType.getInstance()), "main", _localctx.varDefinitions, _localctx.statements);

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        try {
            setState(112);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(68);
                    ((StatementContext) _localctx).T = match(T__8);
                    setState(69);
                    ((StatementContext) _localctx).ex = expressions();
                    setState(70);
                    match(T__0);

                    for (Expression expression : ((StatementContext) _localctx).ex.ast) {
                        _localctx.ast.add(new Print(((StatementContext) _localctx).T.getLine(), expression.getColumn(), expression));
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(73);
                    ((StatementContext) _localctx).T = match(T__9);
                    setState(74);
                    ((StatementContext) _localctx).ex = expressions();
                    setState(75);
                    match(T__0);

                    for (Expression expression : ((StatementContext) _localctx).ex.ast) {
                        _localctx.ast.add(new Input(((StatementContext) _localctx).T.getLine(), expression.getColumn(), expression));
                    }

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(78);
                    match(T__10);
                    setState(79);
                    ((StatementContext) _localctx).ex1 = expression(0);
                    setState(80);
                    match(T__0);

                    _localctx.ast.add(new Return(((StatementContext) _localctx).ex1.ast.getLine(), ((StatementContext) _localctx).ex1.ast.getColumn(), ((StatementContext) _localctx).ex1.ast));

                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(83);
                    ((StatementContext) _localctx).ex1 = expression(0);
                    setState(84);
                    match(T__11);
                    setState(85);
                    ((StatementContext) _localctx).ex2 = expression(0);
                    setState(86);
                    match(T__0);

                    _localctx.ast.add(new Assignment(((StatementContext) _localctx).ex1.ast.getLine(), ((StatementContext) _localctx).ex1.ast.getColumn(), ((StatementContext) _localctx).ex1.ast, ((StatementContext) _localctx).ex2.ast));

                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(89);
                    ((StatementContext) _localctx).T = match(T__12);
                    setState(90);
                    ((StatementContext) _localctx).ex1 = expression(0);
                    setState(91);
                    match(T__5);
                    setState(92);
                    ((StatementContext) _localctx).b1 = body();
                    setState(98);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                        case 1: {
                            setState(93);
                            match(T__13);
                            setState(94);
                            match(T__5);
                            setState(95);
                            ((StatementContext) _localctx).b2 = body();
                            ((StatementContext) _localctx).elseBody = ((StatementContext) _localctx).b2.ast;
                        }
                        break;
                    }

                    _localctx.ast.add(new IfElse(((StatementContext) _localctx).T.getLine(), ((StatementContext) _localctx).T.getCharPositionInLine() + 1, ((StatementContext) _localctx).ex1.ast, ((StatementContext) _localctx).b1.ast, _localctx.elseBody));

                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(102);
                    ((StatementContext) _localctx).T = match(T__14);
                    setState(103);
                    ((StatementContext) _localctx).ex1 = expression(0);
                    setState(104);
                    match(T__5);
                    setState(105);
                    ((StatementContext) _localctx).b1 = body();

                    _localctx.ast.add(new While(((StatementContext) _localctx).T.getLine(), ((StatementContext) _localctx).T.getCharPositionInLine() + 1, ((StatementContext) _localctx).ex1.ast, ((StatementContext) _localctx).b1.ast));

                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(108);
                    ((StatementContext) _localctx).fi = functionInvocation();
                    setState(109);
                    match(T__0);

                    _localctx.ast.add(((StatementContext) _localctx).fi.ast);

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 6;
        enterRecursionRule(_localctx, 6, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(145);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        setState(115);
                        ((ExpressionContext) _localctx).ID = match(ID);

                        ((ExpressionContext) _localctx).ast = new Variable(((ExpressionContext) _localctx).ID.getLine(), ((ExpressionContext) _localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext) _localctx).ID != null ? ((ExpressionContext) _localctx).ID.getText() : null));

                    }
                    break;
                    case 2: {
                        setState(117);
                        ((ExpressionContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);

                        ((ExpressionContext) _localctx).ast = new IntLiteral(((ExpressionContext) _localctx).INT_CONSTANT.getLine(),
                                ((ExpressionContext) _localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext) _localctx).INT_CONSTANT != null ? ((ExpressionContext) _localctx).INT_CONSTANT.getText() : null)));

                    }
                    break;
                    case 3: {
                        setState(119);
                        ((ExpressionContext) _localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

                        ((ExpressionContext) _localctx).ast = new CharLiteral(((ExpressionContext) _localctx).CHAR_CONSTANT.getLine(),
                                ((ExpressionContext) _localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext) _localctx).CHAR_CONSTANT != null ? ((ExpressionContext) _localctx).CHAR_CONSTANT.getText() : null)));

                    }
                    break;
                    case 4: {
                        setState(121);
                        ((ExpressionContext) _localctx).REAL_CONSTANT = match(REAL_CONSTANT);

                        ((ExpressionContext) _localctx).ast = new RealLiteral(((ExpressionContext) _localctx).REAL_CONSTANT.getLine(),
                                ((ExpressionContext) _localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext) _localctx).REAL_CONSTANT != null ? ((ExpressionContext) _localctx).REAL_CONSTANT.getText() : null)));

                    }
                    break;
                    case 5: {
                        setState(123);
                        match(T__3);
                        setState(124);
                        ((ExpressionContext) _localctx).e1 = expression(0);
                        setState(125);
                        match(T__4);
                        ((ExpressionContext) _localctx).ast = ((ExpressionContext) _localctx).e1.ast;
                    }
                    break;
                    case 6: {
                        setState(128);
                        ((ExpressionContext) _localctx).fi = functionInvocation();

                        ((ExpressionContext) _localctx).ast = ((ExpressionContext) _localctx).fi.ast;

                    }
                    break;
                    case 7: {
                        setState(131);
                        ((ExpressionContext) _localctx).T = match(T__3);
                        setState(132);
                        ((ExpressionContext) _localctx).tp = type();
                        setState(133);
                        match(T__4);
                        setState(134);
                        ((ExpressionContext) _localctx).ex1 = expression(7);

                        ((ExpressionContext) _localctx).ast = new Cast(((ExpressionContext) _localctx).T.getLine(), ((ExpressionContext) _localctx).T.getCharPositionInLine() + 1, ((ExpressionContext) _localctx).ex1.ast, ((ExpressionContext) _localctx).tp.ast);

                    }
                    break;
                    case 8: {
                        setState(137);
                        match(T__18);
                        setState(138);
                        ((ExpressionContext) _localctx).ex1 = expression(6);

                        ((ExpressionContext) _localctx).ast = new UnaryMinus(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast);

                    }
                    break;
                    case 9: {
                        setState(141);
                        match(T__19);
                        setState(142);
                        ((ExpressionContext) _localctx).ex1 = expression(5);

                        ((ExpressionContext) _localctx).ast = new UnaryNot(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast);

                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(179);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(177);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                                case 1: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    _localctx.ex1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(147);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(148);
                                    ((ExpressionContext) _localctx).OP = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
                                        ((ExpressionContext) _localctx).OP = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(149);
                                    ((ExpressionContext) _localctx).ex2 = expression(5);

                                    ((ExpressionContext) _localctx).ast = new Arithmetic(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast, ((ExpressionContext) _localctx).ex2.ast, (((ExpressionContext) _localctx).OP != null ? ((ExpressionContext) _localctx).OP.getText() : null));

                                }
                                break;
                                case 2: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    _localctx.ex1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(152);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(153);
                                    ((ExpressionContext) _localctx).OP = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__18 || _la == T__23)) {
                                        ((ExpressionContext) _localctx).OP = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(154);
                                    ((ExpressionContext) _localctx).ex2 = expression(4);

                                    ((ExpressionContext) _localctx).ast = new Arithmetic(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast, ((ExpressionContext) _localctx).ex2.ast, (((ExpressionContext) _localctx).OP != null ? ((ExpressionContext) _localctx).OP.getText() : null));

                                }
                                break;
                                case 3: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    _localctx.ex1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(157);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(158);
                                    ((ExpressionContext) _localctx).OP = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) {
                                        ((ExpressionContext) _localctx).OP = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(159);
                                    ((ExpressionContext) _localctx).ex2 = expression(3);

                                    ((ExpressionContext) _localctx).ast = new Comparison(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast, ((ExpressionContext) _localctx).ex2.ast, (((ExpressionContext) _localctx).OP != null ? ((ExpressionContext) _localctx).OP.getText() : null));

                                }
                                break;
                                case 4: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    _localctx.ex1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(162);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(163);
                                    ((ExpressionContext) _localctx).OP = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__30 || _la == T__31)) {
                                        ((ExpressionContext) _localctx).OP = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(164);
                                    ((ExpressionContext) _localctx).ex2 = expression(2);

                                    ((ExpressionContext) _localctx).ast = new Logical(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast, ((ExpressionContext) _localctx).ex2.ast, (((ExpressionContext) _localctx).OP != null ? ((ExpressionContext) _localctx).OP.getText() : null));

                                }
                                break;
                                case 5: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    _localctx.ex1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(167);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(168);
                                    match(T__15);
                                    setState(169);
                                    ((ExpressionContext) _localctx).ex2 = expression(0);
                                    setState(170);
                                    match(T__16);

                                    ((ExpressionContext) _localctx).ast = new ArrayAccess(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast, ((ExpressionContext) _localctx).ex2.ast);

                                }
                                break;
                                case 6: {
                                    _localctx = new ExpressionContext(_parentctx, _parentState);
                                    _localctx.ex1 = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(173);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(174);
                                    match(T__17);
                                    setState(175);
                                    ((ExpressionContext) _localctx).ID = match(ID);

                                    ((ExpressionContext) _localctx).ast = new StructAccess(((ExpressionContext) _localctx).ex1.ast.getLine(), ((ExpressionContext) _localctx).ex1.ast.getColumn(), ((ExpressionContext) _localctx).ex1.ast, (((ExpressionContext) _localctx).ID != null ? ((ExpressionContext) _localctx).ID.getText() : null));

                                }
                                break;
                            }
                        }
                    }
                    setState(181);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_type);
        try {
            setState(200);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__32:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(182);
                    ((TypeContext) _localctx).T = match(T__32);

                    ((TypeContext) _localctx).ast = CharType.getInstance();

                }
                break;
                case T__33:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(184);
                    ((TypeContext) _localctx).T = match(T__33);

                    ((TypeContext) _localctx).ast = RealType.getInstance();

                }
                break;
                case T__34:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(186);
                    ((TypeContext) _localctx).T = match(T__34);

                    ((TypeContext) _localctx).ast = IntType.getInstance();

                }
                break;
                case T__15:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(188);
                    ((TypeContext) _localctx).T = match(T__15);
                    setState(189);
                    ((TypeContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
                    setState(190);
                    match(T__16);
                    setState(191);
                    ((TypeContext) _localctx).tp = type();

                    ((TypeContext) _localctx).ast = new ArrayType(((TypeContext) _localctx).T.getLine(), ((TypeContext) _localctx).T.getCharPositionInLine() + 1,
                            LexerHelper.lexemeToInt((((TypeContext) _localctx).INT_CONSTANT != null ? ((TypeContext) _localctx).INT_CONSTANT.getText() : null)), ((TypeContext) _localctx).tp.ast);

                }
                break;
                case T__35:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(194);
                    ((TypeContext) _localctx).T = match(T__35);
                    setState(195);
                    match(T__6);
                    setState(196);
                    ((TypeContext) _localctx).structFieldList = structFields();
                    setState(197);
                    match(T__7);

                    ((TypeContext) _localctx).ast = new StructType(((TypeContext) _localctx).T.getLine(), ((TypeContext) _localctx).T.getCharPositionInLine() + 1, ((TypeContext) _localctx).structFieldList.ast);

                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StructFieldsContext structFields() throws RecognitionException {
        StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_structFields);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(208);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(202);
                            ((StructFieldsContext) _localctx).idList = ids();
                            setState(203);
                            match(T__5);
                            setState(204);
                            ((StructFieldsContext) _localctx).tp = type();
                            setState(205);
                            match(T__0);

                            for (Variable v : ((StructFieldsContext) _localctx).idList.ast) {
                                StructField a = new StructField(v.getLine(), v.getColumn(), ((StructFieldsContext) _localctx).tp.ast, v.getName());
                                if (_localctx.ast.contains(a)) {
                                    new ErrorType(v.getLine(), v.getColumn(), "StructField " + v.getName() + " has already been declared");
                                } else {
                                    _localctx.ast.add(a);
                                }
                            }

                        }
                    }
                    setState(210);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableDefinitionContext variableDefinition() throws RecognitionException {
        VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_variableDefinition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                ((VariableDefinitionContext) _localctx).idList = ids();
                setState(213);
                match(T__5);
                setState(214);
                ((VariableDefinitionContext) _localctx).tp = type();

                for (Variable v : ((VariableDefinitionContext) _localctx).idList.ast) {
                    VariableDefinition vd = new VariableDefinition(v.getLine(), v.getColumn(), ((VariableDefinitionContext) _localctx).tp.ast, v.getName());
                    if (_localctx.ast.contains(vd)) {
                        new ErrorType(v.getLine(), v.getColumn(), "Variable " + v.getName() + " has already been declared");
                    } else {
                        _localctx.ast.add(vd);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
        FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_functionDefinition);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                ((FunctionDefinitionContext) _localctx).T = match(T__1);
                setState(218);
                ((FunctionDefinitionContext) _localctx).ID = match(ID);
                setState(219);
                match(T__3);
                setState(223);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(220);
                        ((FunctionDefinitionContext) _localctx).p = params();
                        ((FunctionDefinitionContext) _localctx).paramsList = ((FunctionDefinitionContext) _localctx).p.ast;
                    }
                }

                setState(225);
                match(T__4);
                setState(226);
                match(T__5);
                setState(230);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((_la) & ~0x3f) == 0 && ((1L << _la) & 128849084416L) != 0) {
                    {
                        setState(227);
                        ((FunctionDefinitionContext) _localctx).tp = type();
                        ((FunctionDefinitionContext) _localctx).returnType = ((FunctionDefinitionContext) _localctx).tp.ast;
                    }
                }

                setState(232);
                match(T__6);
                setState(239);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(233);
                                ((FunctionDefinitionContext) _localctx).vd = variableDefinition();
                                setState(234);
                                match(T__0);
                                _localctx.varDefinitions.addAll(((FunctionDefinitionContext) _localctx).vd.ast);
                            }
                        }
                    }
                    setState(241);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                }
                setState(247);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492676034064L) != 0) {
                    {
                        {
                            setState(242);
                            ((FunctionDefinitionContext) _localctx).st1 = statement();
                            _localctx.statements.addAll(((FunctionDefinitionContext) _localctx).st1.ast);
                        }
                    }
                    setState(249);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(250);
                match(T__7);

                ((FunctionDefinitionContext) _localctx).ast = new ast.definitions.FunctionDefinition(((FunctionDefinitionContext) _localctx).T.getLine(), ((FunctionDefinitionContext) _localctx).T.getCharPositionInLine() + 1,
                        new FunctionType(_localctx.returnType.getLine(), _localctx.returnType.getColumn(), _localctx.paramsList, _localctx.returnType), (((FunctionDefinitionContext) _localctx).ID != null ? ((FunctionDefinitionContext) _localctx).ID.getText() : null), _localctx.varDefinitions, _localctx.statements);

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionInvocationContext functionInvocation() throws RecognitionException {
        FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_functionInvocation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                ((FunctionInvocationContext) _localctx).ID = match(ID);
                setState(254);
                match(T__3);
                setState(258);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492675989520L) != 0) {
                    {
                        setState(255);
                        ((FunctionInvocationContext) _localctx).ex = expressions();
                        ((FunctionInvocationContext) _localctx).paramsList = ((FunctionInvocationContext) _localctx).ex.ast;
                    }
                }

                setState(260);
                match(T__4);

                ((FunctionInvocationContext) _localctx).ast = new FunctionInvocation(((FunctionInvocationContext) _localctx).ID.getLine(), ((FunctionInvocationContext) _localctx).ID.getCharPositionInLine() + 1,
                        _localctx.paramsList, new Variable(((FunctionInvocationContext) _localctx).ID.getLine(), ((FunctionInvocationContext) _localctx).ID.getCharPositionInLine() + 1, (((FunctionInvocationContext) _localctx).ID != null ? ((FunctionInvocationContext) _localctx).ID.getText() : null)));

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BodyContext body() throws RecognitionException {
        BodyContext _localctx = new BodyContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_body);
        int _la;
        try {
            setState(276);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__3:
                case T__8:
                case T__9:
                case T__10:
                case T__12:
                case T__14:
                case T__18:
                case T__19:
                case ID:
                case INT_CONSTANT:
                case CHAR_CONSTANT:
                case REAL_CONSTANT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(263);
                    ((BodyContext) _localctx).st1 = statement();
                    _localctx.ast.addAll(((BodyContext) _localctx).st1.ast);
                }
                break;
                case T__6:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(266);
                    match(T__6);
                    setState(272);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492676034064L) != 0) {
                        {
                            {
                                setState(267);
                                ((BodyContext) _localctx).st2 = statement();
                                _localctx.ast.addAll(((BodyContext) _localctx).st2.ast);
                            }
                        }
                        setState(274);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(275);
                    match(T__7);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionsContext expressions() throws RecognitionException {
        ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_expressions);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                ((ExpressionsContext) _localctx).ex1 = expression(0);
                _localctx.ast.add(((ExpressionsContext) _localctx).ex1.ast);
                setState(286);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__36) {
                    {
                        {
                            setState(280);
                            match(T__36);
                            setState(281);
                            ((ExpressionsContext) _localctx).ex2 = expression(0);
                            _localctx.ast.add(((ExpressionsContext) _localctx).ex2.ast);
                        }
                    }
                    setState(288);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParamsContext params() throws RecognitionException {
        ParamsContext _localctx = new ParamsContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_params);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(289);
                ((ParamsContext) _localctx).vd1 = variableDefinition();
                _localctx.ast.addAll(((ParamsContext) _localctx).vd1.ast);
                setState(297);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__36) {
                    {
                        {
                            setState(291);
                            match(T__36);
                            setState(292);
                            ((ParamsContext) _localctx).vd2 = variableDefinition();
                            _localctx.ast.addAll(((ParamsContext) _localctx).vd2.ast);
                        }
                    }
                    setState(299);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IdsContext ids() throws RecognitionException {
        IdsContext _localctx = new IdsContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_ids);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(300);
                ((IdsContext) _localctx).id1 = match(ID);
                _localctx.ast.add(new Variable(((IdsContext) _localctx).id1.getLine(), ((IdsContext) _localctx).id1.getCharPositionInLine() + 1, (((IdsContext) _localctx).id1 != null ? ((IdsContext) _localctx).id1.getText() : null)));
                setState(307);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__36) {
                    {
                        {
                            setState(302);
                            match(T__36);
                            setState(303);
                            ((IdsContext) _localctx).id2 = match(ID);
                            _localctx.ast.add(new Variable(((IdsContext) _localctx).id2.getLine(), ((IdsContext) _localctx).id2.getCharPositionInLine() + 1, (((IdsContext) _localctx).id2 != null ? ((IdsContext) _localctx).id2.getText() : null)));
                        }
                    }
                    setState(309);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 3:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 4);
            case 1:
                return precpred(_ctx, 3);
            case 2:
                return precpred(_ctx, 2);
            case 3:
                return precpred(_ctx, 1);
            case 4:
                return precpred(_ctx, 9);
            case 5:
                return precpred(_ctx, 8);
        }
        return true;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgramContext extends ParserRuleContext {
        public Program ast;
        public List<Definition> definitions = new ArrayList<Definition>();
        public VariableDefinitionContext vd;
        public FunctionDefinitionContext fd;
        public MainContext m;

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(PmmParser.EOF, 0);
        }

        public MainContext main() {
            return getRuleContext(MainContext.class, 0);
        }

        public List<VariableDefinitionContext> variableDefinition() {
            return getRuleContexts(VariableDefinitionContext.class);
        }

        public VariableDefinitionContext variableDefinition(int i) {
            return getRuleContext(VariableDefinitionContext.class, i);
        }

        public List<FunctionDefinitionContext> functionDefinition() {
            return getRuleContexts(FunctionDefinitionContext.class);
        }

        public FunctionDefinitionContext functionDefinition(int i) {
            return getRuleContext(FunctionDefinitionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MainContext extends ParserRuleContext {
        public Definition ast;
        public List<VariableDefinition> varDefinitions = new ArrayList<VariableDefinition>();
        public List<Statement> statements = new ArrayList<Statement>();
        public Token T;
        public VariableDefinitionContext vd;
        public StatementContext st1;

        public MainContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<VariableDefinitionContext> variableDefinition() {
            return getRuleContexts(VariableDefinitionContext.class);
        }

        public VariableDefinitionContext variableDefinition(int i) {
            return getRuleContext(VariableDefinitionContext.class, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_main;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitMain(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatementContext extends ParserRuleContext {
        public List<Statement> ast = new ArrayList<Statement>();
        public List<Statement> elseBody = new ArrayList<Statement>();
        public Token T;
        public ExpressionsContext ex;
        public ExpressionContext ex1;
        public ExpressionContext ex2;
        public BodyContext b1;
        public BodyContext b2;
        public FunctionInvocationContext fi;

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionsContext expressions() {
            return getRuleContext(ExpressionsContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<BodyContext> body() {
            return getRuleContexts(BodyContext.class);
        }

        public BodyContext body(int i) {
            return getRuleContext(BodyContext.class, i);
        }

        public FunctionInvocationContext functionInvocation() {
            return getRuleContext(FunctionInvocationContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionContext extends ParserRuleContext {
        public Expression ast;
        public ExpressionContext ex1;
        public Token ID;
        public Token INT_CONSTANT;
        public Token CHAR_CONSTANT;
        public Token REAL_CONSTANT;
        public ExpressionContext e1;
        public FunctionInvocationContext fi;
        public Token T;
        public TypeContext tp;
        public Token OP;
        public ExpressionContext ex2;

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(PmmParser.ID, 0);
        }

        public TerminalNode INT_CONSTANT() {
            return getToken(PmmParser.INT_CONSTANT, 0);
        }

        public TerminalNode CHAR_CONSTANT() {
            return getToken(PmmParser.CHAR_CONSTANT, 0);
        }

        public TerminalNode REAL_CONSTANT() {
            return getToken(PmmParser.REAL_CONSTANT, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public FunctionInvocationContext functionInvocation() {
            return getRuleContext(FunctionInvocationContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypeContext extends ParserRuleContext {
        public Type ast;
        public Token T;
        public Token INT_CONSTANT;
        public TypeContext tp;
        public StructFieldsContext structFieldList;

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT_CONSTANT() {
            return getToken(PmmParser.INT_CONSTANT, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public StructFieldsContext structFields() {
            return getRuleContext(StructFieldsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StructFieldsContext extends ParserRuleContext {
        public List<StructField> ast = new ArrayList<StructField>();
        public IdsContext idList;
        public TypeContext tp;

        public StructFieldsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<IdsContext> ids() {
            return getRuleContexts(IdsContext.class);
        }

        public IdsContext ids(int i) {
            return getRuleContext(IdsContext.class, i);
        }

        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_structFields;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitStructFields(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VariableDefinitionContext extends ParserRuleContext {
        public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
        public IdsContext idList;
        public TypeContext tp;

        public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IdsContext ids() {
            return getRuleContext(IdsContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDefinition;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitVariableDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionDefinitionContext extends ParserRuleContext {
        public FunctionDefinition ast;
        public Type returnType = VoidType.getInstance();
        public List<VariableDefinition> paramsList = new ArrayList<VariableDefinition>();
        public List<VariableDefinition> varDefinitions = new ArrayList<VariableDefinition>();
        public List<Statement> statements = new ArrayList<Statement>();
        public Token T;
        public Token ID;
        public ParamsContext p;
        public TypeContext tp;
        public VariableDefinitionContext vd;
        public StatementContext st1;

        public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(PmmParser.ID, 0);
        }

        public ParamsContext params() {
            return getRuleContext(ParamsContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<VariableDefinitionContext> variableDefinition() {
            return getRuleContexts(VariableDefinitionContext.class);
        }

        public VariableDefinitionContext variableDefinition(int i) {
            return getRuleContext(VariableDefinitionContext.class, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDefinition;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitFunctionDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionInvocationContext extends ParserRuleContext {
        public FunctionInvocation ast;
        public List<Expression> paramsList = new ArrayList<Expression>();
        public Token ID;
        public ExpressionsContext ex;

        public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(PmmParser.ID, 0);
        }

        public ExpressionsContext expressions() {
            return getRuleContext(ExpressionsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionInvocation;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitFunctionInvocation(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BodyContext extends ParserRuleContext {
        public List<Statement> ast = new ArrayList<Statement>();
        public StatementContext st1;
        public StatementContext st2;

        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitBody(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionsContext extends ParserRuleContext {
        public List<Expression> ast = new ArrayList<Expression>();
        public ExpressionContext ex1;
        public ExpressionContext ex2;

        public ExpressionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressions;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitExpressions(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParamsContext extends ParserRuleContext {
        public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
        public VariableDefinitionContext vd1;
        public VariableDefinitionContext vd2;

        public ParamsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<VariableDefinitionContext> variableDefinition() {
            return getRuleContexts(VariableDefinitionContext.class);
        }

        public VariableDefinitionContext variableDefinition(int i) {
            return getRuleContext(VariableDefinitionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_params;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitParams(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdsContext extends ParserRuleContext {
        public List<Variable> ast = new ArrayList<Variable>();
        public Token id1;
        public Token id2;

        public IdsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(PmmParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(PmmParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ids;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PmmVisitor) return ((PmmVisitor<? extends T>) visitor).visitIds(this);
            else return visitor.visitChildren(this);
        }
    }
}