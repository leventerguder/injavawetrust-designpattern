package _01.singleton.eager.initialization;

public class EagerInitialization {

	private static final EagerInitialization instance = new EagerInitialization();

	private EagerInitialization() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4 Joshua Bloch		
		throw new RuntimeException();
	}

	public static EagerInitialization getInstance() {
		return instance;
	}
}