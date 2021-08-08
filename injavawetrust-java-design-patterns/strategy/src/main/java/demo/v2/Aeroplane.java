package demo.v2;

public class Aeroplane extends Vehicle implements TransportInterface{

    @Override
    public void showMe() {
        System.out.println("I am an aeroplane.");
    }

    @Override
    public void showTransportMedium() {
        System.out.println("I am transporting in air.");
    }
}
