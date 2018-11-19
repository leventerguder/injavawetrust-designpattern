package ch01.examples.v5;

// The interface that all flying behavior classes implement.
public interface FlyBehavior {
	public void fly();

	// Here we have an interface that all flying classes implement.
	// All new flying classes just need to implement the fly method.
}
