package _06.singleton.billpugh;

public class SingletonBillPughTest {

	public static void main(String[] args) {

		SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
		SingletonBillPugh instance2 = SingletonBillPugh.getInstance();

		System.out.println(instance1 == instance2);
	}
}
