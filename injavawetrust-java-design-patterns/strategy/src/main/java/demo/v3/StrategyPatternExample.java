package demo.v3;

public class StrategyPatternExample {

    public static void main(String[] args) {

        System.out.println("***Strategy Pattern Demo***");
        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("________");
        vehicleContext = new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("________");


        vehicleContext = new SpecialVehicle();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("- - - - -");
        //Changing the behavior of Special vehicle
        vehicleContext.setTransportMedium(new WaterTransport());
        vehicleContext.showTransportMedium();

    }

}
