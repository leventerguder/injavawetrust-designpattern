package singleton03.lazy.initialization;

public class LazyInitializedSingletonTest {

    public static void main(String[] args) {

        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
