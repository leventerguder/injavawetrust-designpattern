package demo.v1;

public abstract class Vehicle {

    private TransportMedium transportMedium;

    public void showTransportMedium() {
        transportMedium.transport();
    }

    public void commonJob() {
        System.out.println("We all can be used to transport");
    }

    public abstract void showMe();

    public TransportMedium getTransportMedium() {
        return transportMedium;
    }

    public void setTransportMedium(TransportMedium transportMedium) {
        this.transportMedium = transportMedium;
    }
}
