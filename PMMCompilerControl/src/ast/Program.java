package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions) {
        super(line, column);
        this.definitions = definitions;
    }

    public List<Definition> getDefinitions() {
        return new ArrayList<>(definitions);
    }

    @Override
    public String toString() {
        return "Program{" +
                "definitions=" + definitions +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
