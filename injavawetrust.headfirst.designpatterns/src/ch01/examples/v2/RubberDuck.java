package ch01.examples.v2;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("RubberDuck#display");
		// looks like a rubberduck
	}

	@Override
	public void quack() {
		// Rubber duck dont quack , so quack() is overridden to "squeak"
	}

	// I could always just override the fly method in rubber duck , the way I am
	// with the quack() method

	@Override
	public void fly() {
		// override to do nothing
	}
	
	// but then what happens when we add wooden decoy ducks to the program ?
	// They arent supposed to fly or quack
}
