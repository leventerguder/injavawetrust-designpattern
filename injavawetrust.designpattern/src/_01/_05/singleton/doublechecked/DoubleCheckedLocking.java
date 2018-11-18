package _01._05.singleton.doublechecked;

public class DoubleCheckedLocking {

	// The volatile keyword ensures that multiple threads handle "instance"
	// variable correctly when it is being initialized to the
	// SingletonDoubleCheckedLocking

	// Double Checked Locking is fixed in Java 1.5
	// http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
	private volatile static DoubleCheckedLocking instance;

	private DoubleCheckedLocking() {

	}

	public static DoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
}
