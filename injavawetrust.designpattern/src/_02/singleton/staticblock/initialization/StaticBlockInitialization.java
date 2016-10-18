package _02.singleton.staticblock.initialization;

public class StaticBlockInitialization {

	private StaticBlockInitialization() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4, Joshua Bloch		
		throw new RuntimeException();
	}

	private static StaticBlockInitialization instance;

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			// handle exception
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}
}