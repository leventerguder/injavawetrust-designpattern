package demo.v2;

public class StrategyPatternExample {

    public static void main(String[] args) {

        System.out.println("***Strategy Pattern Demo***");
        Boat boat = new Boat();
        boat.showMe();
        boat.showTransportMedium();

        System.out.println("________");
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.showMe();
        aeroplane.showTransportMedium();

        /*
            You can see that each class and its subclasses may need to provide its own implementations
            for the showTransportMedium() method. So, you cannot reuse your code,
            which is as bad as inheritance in this case.
         */
    }
}
