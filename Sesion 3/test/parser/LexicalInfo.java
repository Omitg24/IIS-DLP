package parser;

class LexicalInfo {
	
	private int line, column, tokenKey;
	
	private String lexeme;

	public Object semanticValue;
	
	public LexicalInfo(int line, int column, String lexeme, int tokenKey, Object semanticValue) {
		this.line = line;
		this.column = column;
		this.lexeme = lexeme;
		this.tokenKey = tokenKey;
		this.semanticValue = semanticValue;
	}
	
	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(line ").append(this.line)
			.append(", column ").append(this.column)
			.append(", lexeme '").append(this.lexeme).append("'")
			.append(", token key ").append(this.tokenKey)
			.append(", semantic value ").append(this.semanticValue)
			.append(")");
		return sb.toString();
	}
	
	public void assertEquals(int line, int column, String lexeme, int tokenKey, Object semanticValue) {
		assert this.line == line : "Assert failed in token " + this + ". Expected line " + this.line + ", obtained " + line + ".";
		assert this.column == column : "Assert failed in token " + this + ". Expected column " + this.column + ", obtained " + column + ".";
		assert this.lexeme.equals(lexeme) : "Assert failed in token " + this + ". Expected lexeme " + this.lexeme + ", obtained " + lexeme + ".";
		assert this.tokenKey == tokenKey : "Assert failed in token " + this + ". Expected token name " + this.tokenKey + ", obtained " + tokenKey + ".";
		assert this.semanticValue.equals(semanticValue) : "Assert failed in token " + this + ". Expected semanticValue " + this.semanticValue + ", obtained " + semanticValue + ".";
	}
}
