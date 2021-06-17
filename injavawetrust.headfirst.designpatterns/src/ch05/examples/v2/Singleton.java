package ch05.examples.v2;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    // By adding the syncronized keyword to getInstance we force every thread
    // to get wait its turn before it can enter the method.
    // That is , no two threads may enter the method at the same time.
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
