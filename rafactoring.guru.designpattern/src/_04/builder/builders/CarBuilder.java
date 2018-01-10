package _04.builder.builders;

import _04.builder.builders.cars.Car;
import _04.builder.builders.cars.Type;
import _04.builder.builders.components.Engine;
import _04.builder.builders.components.GPSNavigator;
import _04.builder.builders.components.Transmission;
import _04.builder.builders.components.TripComputer;

public class CarBuilder implements Builder {

	private Type type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	public void setType(Type type) {
		this.type = type;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}

}
