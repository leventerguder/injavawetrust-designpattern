package ch01.examples.v4;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("FlyWithWings#fly");
		// Here is the implementation of flying for all ducks that have wings.
	}

}
