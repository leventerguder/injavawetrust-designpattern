package ch05.examples.v3;

//Move to an eagerly created instance rather than a lazily created one.
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
