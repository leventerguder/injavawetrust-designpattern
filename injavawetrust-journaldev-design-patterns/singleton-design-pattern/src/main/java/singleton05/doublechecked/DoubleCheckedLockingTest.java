package singleton05.doublechecked;

public class DoubleCheckedLockingTest {

    public static void main(String[] args) {

        DoubleCheckedLocking instance1 = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking instance2 = DoubleCheckedLocking.getInstance();

        System.out.println(instance1 == instance2);
    }
}
