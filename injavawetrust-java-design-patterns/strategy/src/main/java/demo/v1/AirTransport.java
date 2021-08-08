package demo.v1;

public class AirTransport implements TransportMedium {

    @Override
    public void transport() {
        System.out.println("I am transporting in air.");
    }
}
