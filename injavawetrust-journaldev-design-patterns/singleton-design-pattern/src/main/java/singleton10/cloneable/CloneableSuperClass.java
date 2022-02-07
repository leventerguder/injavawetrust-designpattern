package singleton10.cloneable;

public class CloneableSuperClass implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
