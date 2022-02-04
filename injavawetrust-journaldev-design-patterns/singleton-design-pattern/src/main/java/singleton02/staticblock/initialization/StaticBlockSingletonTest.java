package singleton02.staticblock.initialization;

public class StaticBlockSingletonTest {

    public static void main(String[] args) {

        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
