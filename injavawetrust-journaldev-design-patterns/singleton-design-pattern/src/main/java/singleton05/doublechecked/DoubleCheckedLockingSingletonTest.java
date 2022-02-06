package singleton05.doublechecked;

public class DoubleCheckedLockingSingletonTest {

    public static void main(String[] args) {

        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton instance2 = DoubleCheckedLockingSingleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
