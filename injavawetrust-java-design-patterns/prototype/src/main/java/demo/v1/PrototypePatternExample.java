package demo.v1;

public class PrototypePatternExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("***Prototype Pattern Demo***\n");
        BasicCar nano = new Nano("Green Nano");
        nano.setBasePrice(100000);


        BasicCar ford = new Ford("Ford Yellow");
        ford.setBasePrice(500000);

        BasicCar bc1;
        // Nano
        bc1 = nano.clone();

        //Price will be more than 100000 for sure
        bc1.setOnRoadPrice(nano.getBasePrice() + BasicCar.setAdditionalPrice());
        System.out.println("Car is: " + bc1.getModelName() + " and it's price is Rs." + bc1.getOnRoadPrice());


        // Ford
        bc1 = ford.clone();
        //Price will be more than 500000 for sure
        bc1.setOnRoadPrice(ford.getBasePrice() + BasicCar.setAdditionalPrice());
        System.out.println("Car is: " + bc1.getModelName() + " and it's price is Rs." + bc1.getOnRoadPrice());
    }
}
