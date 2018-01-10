package _04.builder.builders.director;

import _04.builder.builders.Builder;
import _04.builder.builders.cars.Type;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */

import _04.builder.builders.components.*;

public class Director {

	public void constructSportsCar(Builder builder) {
		builder.setType(Type.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructCityCar(Builder builder) {
		builder.setType(Type.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructSUV(Builder builder) {
		builder.setType(Type.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
}