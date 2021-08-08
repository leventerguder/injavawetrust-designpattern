package demo.v1;

public class Aeroplane extends Vehicle {

    public Aeroplane() {
        setTransportMedium(new AirTransport());
    }

    @Override
    public void showMe() {
        System.out.println("I am an aeroplane.");
    }
}
