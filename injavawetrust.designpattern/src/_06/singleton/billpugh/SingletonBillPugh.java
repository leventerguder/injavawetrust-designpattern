package _06.singleton.billpugh;

public class SingletonBillPugh {

	private SingletonBillPugh() {
		// Enforce noninstantiability with a private constructor
		// Effective Java , Item 4 Joshua Bloch		
		throw new RuntimeException();
	}

	private static class SingletonHelper {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {
		return SingletonHelper.INSTANCE;
	}
}