package _01.singleton.eager.initialization;

public class EagerInitializationTest {

	public static void main(String[] args) {
		
		EagerInitialization instance1 = EagerInitialization.getInstance();
		EagerInitialization instance2 = EagerInitialization.getInstance();

		System.out.println(instance1 == instance2);
	}
}
