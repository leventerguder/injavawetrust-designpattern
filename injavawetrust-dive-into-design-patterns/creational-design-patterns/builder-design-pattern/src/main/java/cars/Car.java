package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Using the builders.Builder pattern makes sense only when your products are quite complex and require extensive configuration.
 * The following two products are related, although they don't have a common interface.
 */

public class Car {
    private final CarType carType;

    private final int seats;

    private final Engine engine;

    private final Transmission transmission;

    private final TripComputer tripComputer;

    private final GPSNavigator gpsNavigator;

    private double fuel;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
               GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
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

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
