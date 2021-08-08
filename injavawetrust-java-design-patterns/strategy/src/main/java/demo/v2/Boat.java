package demo.v2;

public class Boat extends Vehicle implements TransportInterface{

    @Override
    public void showMe() {
        System.out.println("I am a boat.");
    }

    @Override
    public void showTransportMedium() {
        System.out.println("I am transporting in water.");
    }
}
