package singleton10.cloneable;

public class ThrowExceptionCloneableSingleton extends CloneableSuperClass {

    private static final ThrowExceptionCloneableSingleton INSTANCE = new ThrowExceptionCloneableSingleton();

    private ThrowExceptionCloneableSingleton() {
    }

    public static ThrowExceptionCloneableSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

/*
To overcome this issue, override clone() method and throw an exception from clone method that is
CloneNotSupportedException. Now whenever user will try to create clone of singleton object, it will throw exception and
hence our class remains singleton.
 */
