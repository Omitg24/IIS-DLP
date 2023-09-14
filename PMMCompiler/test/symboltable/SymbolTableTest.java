package symboltable;


import ast.definitions.VariableDefinition;

public class SymbolTableTest {

    public static void main(String[] args) {
        SymbolTableTest test = new SymbolTableTest();
        test.testInsert();
        test.testFind();
        test.testFindInCurrentScope();
    }

    public void testInsert() {
        SymbolTable st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(0, 0, null, "a");
        assert st.insert(definition);
        assert definition.getScope() == 0;
        assert !st.insert(definition);
        st.set();
        VariableDefinition definition2 = new VariableDefinition(0, 0, null, "a");
        assert st.insert(definition2);
        assert definition2.getScope() == 1;
        assert !st.insert(definition2);
        st.reset();
        assert !st.insert(definition);
    }

    public void testFind() {
        SymbolTable st = new SymbolTable();
        VariableDefinition VariableDefinition = new VariableDefinition(0, 0, null, "a");
        assert st.insert(VariableDefinition);
        assert st.find("a") != null;
        assert st.find("b") == null;
        st.set();
        VariableDefinition VariableDefinition2 = new VariableDefinition(0, 0, null, "b");
        assert st.insert(VariableDefinition2);
        assert st.find("b") != null;
        assert st.find("a") != null;
        assert st.find("c") == null;
        st.reset();
        assert st.find("a") != null;
        assert st.find("b") == null;
    }

    public void testFindInCurrentScope() {
        SymbolTable st = new SymbolTable();
        VariableDefinition VariableDefinition = new VariableDefinition(0, 0, null, "a");
        assert st.insert(VariableDefinition);
        assert st.findInCurrentScope("a") != null;
        assert st.findInCurrentScope("b") == null;
        st.set();
        VariableDefinition VariableDefinition2 = new VariableDefinition(0, 0, null, "b");
        assert st.insert(VariableDefinition2);
        assert st.findInCurrentScope("b") != null;
        assert st.findInCurrentScope("a") == null;
        assert st.findInCurrentScope("c") == null;
        st.reset();
        assert st.findInCurrentScope("a") != null;
        assert st.findInCurrentScope("b") == null;
    }

}
