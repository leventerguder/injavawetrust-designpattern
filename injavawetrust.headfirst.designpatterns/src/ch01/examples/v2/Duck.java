package ch01.examples.v2;

public abstract class Duck {

	public void quack() {
		System.out.println("Duck#quack...");
	}

	public void swim() {
		System.out.println("Duck#swim...");
	}

	public abstract void display();

	// But now we need the ducks to FLY!

	public void fly() {
		System.out.println("Duck#fly...");
	}

	// Joe failed to notice that not all subclasses of Duck should fly.
	// When Joe added new behavior to the Duck superclass , he was also adding
	// behavior that was not appropriate for some Duck subclasses.

	// A localized update to the code caused a non-local side effect (flying rubber
	// ducks)

	// By putting fly() in the superclass in the superclass , he gave flying ability
	// to ALL ducks, including those that shouldnt!
}
