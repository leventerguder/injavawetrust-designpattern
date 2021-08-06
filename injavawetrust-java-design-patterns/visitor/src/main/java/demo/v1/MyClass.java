package demo.v1;

public class MyClass implements OriginalInterface {

    // Here "myInt" is final.So, once initialized, it should not be changed.

    private final int myInt;

    public MyClass() {
        myInt = 5;//Initial or default value
    }

    public int getMyInt() {
        return myInt;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
