package singleton03.lazy.initialization;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

/*
Lazy initialization method to implement Singleton pattern creates the instance in the global access method. Here is the
sample code for creating Singleton class with this approact.

The implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it
can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern
and both threads will get the different instances of the singleton class.`
 */
