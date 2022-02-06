package singleton07.reflection.destroy;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
