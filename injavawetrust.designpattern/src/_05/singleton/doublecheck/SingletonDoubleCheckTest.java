package _05.singleton.doublecheck;

public class SingletonDoubleCheckTest {

	public static void main(String[] args) {

		SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
		SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();

		System.out.println(instance1 == instance2);
	}
}
