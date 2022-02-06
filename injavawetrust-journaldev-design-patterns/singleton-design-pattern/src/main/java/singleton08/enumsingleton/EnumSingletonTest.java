package singleton08.enumsingleton;

public class EnumSingletonTest {

    public static void main(String[] args) {

        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        System.out.println(instance1 == instance2);
    }
}
