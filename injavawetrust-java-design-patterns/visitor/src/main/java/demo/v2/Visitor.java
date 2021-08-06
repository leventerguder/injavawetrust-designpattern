package demo.v2;

public interface Visitor {

    void visitTheElement(CompositeEmployee employee);
    void visitTheElement(SimpleEmployee employee);
}
