package builders;

import cars.CarType;
import cars.Manual;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Unlike other creational patterns , Builder can construct unrelated products, which don't have the common interface.
 * <p>
 * In this case we build a user manual for a car , using the same steps as we built a car.
 * This allows to producte manuals for specific car models, configured with different features.
 */
public class CarManualBuilder implements Builder {

    private CarType carType;

    private int seats;

    private Engine engine;

    private Transmission transmission;

    private TripComputer tripComputer;

    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
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
    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
