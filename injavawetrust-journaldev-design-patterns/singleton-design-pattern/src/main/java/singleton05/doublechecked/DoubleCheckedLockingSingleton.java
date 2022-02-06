package singleton05.doublechecked;

public class DoubleCheckedLockingSingleton {

    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {

    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

/*
The volatile keyword ensures that multiple threads handle "instance" variable correctly when it is being initialized to
the DoubleCheckedLocking Double Checked Locking is fixed in Java 1.5
http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 */
