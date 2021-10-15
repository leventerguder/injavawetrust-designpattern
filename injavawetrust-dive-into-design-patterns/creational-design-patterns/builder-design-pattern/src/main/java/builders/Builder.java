package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGpsNavigator(GPSNavigator gpsNavigator);
}
