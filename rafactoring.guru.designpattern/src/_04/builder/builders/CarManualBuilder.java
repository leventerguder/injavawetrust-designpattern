package _04.builder.builders;

import _04.builder.builders.cars.Manual;
import _04.builder.builders.cars.Type;
import _04.builder.builders.components.Engine;
import _04.builder.builders.components.GPSNavigator;
import _04.builder.builders.components.Transmission;
import _04.builder.builders.components.TripComputer;

public class CarManualBuilder implements Builder {

	private Type type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	@Override
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}

	public Manual getResult() {
		return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}
