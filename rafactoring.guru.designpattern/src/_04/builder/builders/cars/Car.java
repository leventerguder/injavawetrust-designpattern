package _04.builder.builders.cars;

import _04.builder.builders.components.Engine;
import _04.builder.builders.components.GPSNavigator;
import _04.builder.builders.components.Transmission;
import _04.builder.builders.components.TripComputer;

public class Car {
	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private static double fuel = 0;

	public Car(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}

	public void setFuel(double fuel) {
		Car.fuel = fuel;
	}

	public Type getType() {
		return type;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public static double getFuel() {
		return fuel;
	}
}