package _04.singleton.threadsafe;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4 Joshua Bloch		
		throw new RuntimeException();
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
