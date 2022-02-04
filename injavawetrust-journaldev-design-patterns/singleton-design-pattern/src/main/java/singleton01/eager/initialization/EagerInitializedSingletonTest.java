package singleton01.eager.initialization;

public class EagerInitializedSingletonTest {

    public static void main(String[] args) {

        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();

        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

        System.out.println(instance1 == instance2);

    }
}
