package _04.builder.builders;

import _04.builder.builders.cars.Type;
import _04.builder.builders.components.Engine;
import _04.builder.builders.components.GPSNavigator;
import _04.builder.builders.components.Transmission;
import _04.builder.builders.components.TripComputer;

public interface Builder {
	
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
	public void setGPSNavigator(GPSNavigator gpsNavigator);
}