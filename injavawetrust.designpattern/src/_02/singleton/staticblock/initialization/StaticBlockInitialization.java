package _02.singleton.staticblock.initialization;

public class StaticBlockInitialization {

	private StaticBlockInitialization() {
		
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