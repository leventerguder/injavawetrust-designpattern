package demo.v3;

public class Boat extends Vehicle {

    public Boat() {
        setTransportMedium(new WaterTransport());
    }

    @Override
    public void showMe() {
        System.out.println("I am a boat.");
    }
}
