package _01._02.singleton.staticblock.initialization;

public class StaticBlockInitializationTest {

	public static void main(String[] args) {

		StaticBlockInitialization instance1 = StaticBlockInitialization.getInstance();
		StaticBlockInitialization instance2 = StaticBlockInitialization.getInstance();

		System.out.println(instance1 == instance2);
	}
}
