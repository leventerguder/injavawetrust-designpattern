package demo.v2;

public interface Employee {

    void printStructures();

    //The following method has a Visitor argument.
    void acceptVisitor(Visitor visitor);
}
