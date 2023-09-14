package parser;

import org.antlr.v4.runtime.*;

public class LexerTest {

	public static void main(String... args) throws Exception {

		// creates a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName("input.txt");

		// creates a buffer of tokens pulled from the lexer
		PmmLexer lexer = new PmmLexer(input);

		// tests the lexer for the given input file
		Token token;
		int i = 0;
		while ((token = lexer.nextToken()).getType() != PmmLexer.EOF) {
			// We get the semantic value of the token
			Object semanticValue = null;
			switch (token.getType()) {
				case PmmLexer.INT_CONSTANT:
					semanticValue = LexerHelper.lexemeToInt(token.getText());
					break;
					//case PmmLexer.CHAR_CONSTANT:
					//	semanticValue = LexerHelper.lexemeToChar(token.getText());
					//	break;
					//case PmmLexer.REAL_CONSTANT:
					//	semanticValue = LexerHelper.lexemeToReal(token.getText());
					//	break;
			default:
				semanticValue = token.getText();
			}
			// We test the token
			expectedTokens[i].assertEquals(token.getLine(), token.getCharPositionInLine() + 1, token.getText(), token.getType(), semanticValue);
			i++;
		}
	}

	private static LexicalInfo[] expectedTokens = new LexicalInfo[] {
			new LexicalInfo(6, 5, "0", PmmLexer.INT_CONSTANT, 0),
			new LexicalInfo(6, 7, "123", PmmLexer.INT_CONSTANT, 123),
			new LexicalInfo(7, 5, "0", PmmLexer.INT_CONSTANT, 0),
			new LexicalInfo(7, 7, "12", PmmLexer.INT_CONSTANT, 12),
			
			//new LexicalInfo(11, 5, "12.3", PmmLexer.REAL_CONSTANT, 12.3),
			//new LexicalInfo(11, 11, "2.", PmmLexer.REAL_CONSTANT, 2.0),
			//new LexicalInfo(11, 15, ".34", PmmLexer.REAL_CONSTANT, 0.34),
			//new LexicalInfo(12, 5, "34.12E-3", PmmLexer.REAL_CONSTANT, 0.03412),
			//new LexicalInfo(12, 15, "3e3", PmmLexer.REAL_CONSTANT, 3000.0),

			//new LexicalInfo(16, 5, "var1", PmmLexer.ID, "var1"),
			//new LexicalInfo(16, 11, "_var_1", PmmLexer.ID, "_var_1"),
			//new LexicalInfo(16, 19, "VAR_1_AB_2", PmmLexer.ID, "VAR_1_AB_2"),
						
			//new LexicalInfo(20, 5, "'a'", PmmLexer.CHAR_CONSTANT, 'a'),
			//new LexicalInfo(20, 10, "'b'", PmmLexer.CHAR_CONSTANT, 'b'),
			//new LexicalInfo(20, 15, "'.'", PmmLexer.CHAR_CONSTANT, '.'),
			//new LexicalInfo(20, 20, "'-'", PmmLexer.CHAR_CONSTANT, '-'),
			//new LexicalInfo(20, 25, "'~'", PmmLexer.CHAR_CONSTANT, '~'),
			//new LexicalInfo(21, 5, "'\\n'", PmmLexer.CHAR_CONSTANT, '\n'),
			//new LexicalInfo(21, 11, "'\\t'", PmmLexer.CHAR_CONSTANT, '\t'),
			//new LexicalInfo(22, 5, "'\\126'", PmmLexer.CHAR_CONSTANT, '~'),
	};
}
