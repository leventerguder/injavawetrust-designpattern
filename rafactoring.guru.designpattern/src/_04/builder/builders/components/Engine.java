package _04.builder.builders.components;

public class Engine {
	private final double volume;
	private double mileage;
	private static boolean started;

	public Engine(double volume, double mileage) {
		this.volume = volume;
		this.mileage = mileage;
	}

	public void on() {
		Engine.started = true;
	}

	public void of() {
		Engine.started = false;
	}

	public static boolean isStarted() {
		return started;
	}

	public void go(double mileage) {
		if (started) {
			this.mileage += mileage;
		} else {
			System.err.println("Cannot go(), you must start engine first!");
		}
	}

	public double getVolume() {
		return volume;
	}

	public double getMileage() {
		return mileage;
	}
}