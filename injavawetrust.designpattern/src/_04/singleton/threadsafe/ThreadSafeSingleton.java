package _04.singleton.threadsafe;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

	// Thread Safe
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
