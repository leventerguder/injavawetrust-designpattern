package ch01.examples.v3;

public class RedheadDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("RedheadDuck#display");
		// looks like a redhead
	}

	@Override
	public void fly() {
		System.out.println("RedheadDuck#fly");
	}

	@Override
	public void quack() {
		System.out.println("RedheadDuck#quack");
	}

}
