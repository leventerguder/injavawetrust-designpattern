package ch01.examples.v4;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak#quack");
		// rubber duckie squeak
	}

}
