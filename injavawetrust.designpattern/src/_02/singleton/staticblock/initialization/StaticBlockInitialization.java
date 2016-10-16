package _02.singleton.staticblock.initialization;

public class StaticBlockInitialization {

	private StaticBlockInitialization() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4 Joshua Bloch		
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


// Static Block Initialization yaklasimi Eager Initialization yaklasimina benzer.
// Arti yon olarak exception handling mekanizmasini kullanabiliriz.
// Eager yaklasiminda oldugu gibi yine gereksiz yere obje olusacaktir.