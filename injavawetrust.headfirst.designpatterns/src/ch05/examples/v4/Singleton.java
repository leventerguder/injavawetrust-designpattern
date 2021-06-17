package ch05.examples.v4;

// Use “double-checked locking” to reduce the use of synchronization in getInstance().
public class Singleton {

    /*
    The volatile keyword ensures that multiple threads handle the uniqueInstance variable
    correctly when it is being initialized to the Singeton instance.
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
