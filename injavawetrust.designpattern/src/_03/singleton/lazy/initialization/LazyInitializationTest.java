package _03.singleton.lazy.initialization;

public class LazyInitializationTest {

	public static void main(String[] args) {

		LazyInitialization instance1 = LazyInitialization.getInstance();
		LazyInitialization instance2 = LazyInitialization.getInstance();

		System.out.println(instance1 == instance2);
	}
}
