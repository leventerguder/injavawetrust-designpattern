package ch05.examples.v1;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    // not thread safe
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
