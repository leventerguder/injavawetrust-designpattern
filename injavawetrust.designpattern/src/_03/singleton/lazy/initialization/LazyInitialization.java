package _03.singleton.lazy.initialization;

public class LazyInitialization {

	private static LazyInitialization instance;

	private LazyInitialization() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4 , Joshua Bloch		
		throw new RuntimeException();
	}

	//Not Thread Safe!
	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}
}
