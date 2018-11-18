package ch01.examples.v3;

public class MallardDuck extends Duck implements Flyable, Quackable {

	@Override
	public void display() {
		System.out.println("MallardDuck#display");
		// looks like a mallard
	}

	@Override
	public void fly() {
		System.out.println("MallardDuck#fly");
	}

	@Override
	public void quack() {
		System.out.println("MallardDuck#quack");
	}

}
