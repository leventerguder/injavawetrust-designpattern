package demo.v1;

public class Boat extends Vehicle{

    public Boat() {
        setTransportMedium(new WaterTransport());
    }

    @Override
    public void showMe() {
        System.out.println("I am a boat.");
    }
}
