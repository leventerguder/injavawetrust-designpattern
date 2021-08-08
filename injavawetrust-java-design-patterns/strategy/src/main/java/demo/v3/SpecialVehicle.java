package demo.v3;

public class SpecialVehicle extends Vehicle {

    public SpecialVehicle() {
        setTransportMedium(new AirTransport());
    }

    @Override
    public void showMe() {
        System.out.println("I am a special vehicle who can transport both in air and water.");
    }
}
