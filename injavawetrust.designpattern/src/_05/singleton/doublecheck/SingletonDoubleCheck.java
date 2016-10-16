package _05.singleton.doublecheck;

public class SingletonDoubleCheck {

	private static SingletonDoubleCheck instance;

	private SingletonDoubleCheck() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4 Joshua Bloch		
		throw new RuntimeException();
	}

	public static SingletonDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
}
