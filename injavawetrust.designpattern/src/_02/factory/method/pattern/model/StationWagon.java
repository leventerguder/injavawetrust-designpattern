package _02.factory.method.pattern.model;

public class StationWagon implements Car {

    @Override
    public String getModel() {
        return "StationWagon";
    }

    @Override
    public double getPrice() {
        return 1500;
    }

    @Override
    public void speedUp() {
        System.out.println("StationWagon#speedUp");
    }

}
