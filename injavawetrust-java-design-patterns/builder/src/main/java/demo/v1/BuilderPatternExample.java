package demo.v1;

public class BuilderPatternExample {

    public static void main(String[] args) {

        Director director = new Director();
        Builder fordCar = new Car("Ford");
        Builder hondaMotorycle = new MotorCycle("Honda");

        // Making Car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();

        //Making MotorCycle
        director.construct(hondaMotorycle );
        Product p2 = hondaMotorycle.getVehicle();
        p2.showProduct();
    }

}
