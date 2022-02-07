package singleton10.cloneable;

public class CloneableSingleton extends CloneableSuperClass {

    private static final CloneableSingleton INSTANCE = new CloneableSingleton();

    private CloneableSingleton() {
    }

    public static CloneableSingleton getInstance() {
        return INSTANCE;
    }
}
