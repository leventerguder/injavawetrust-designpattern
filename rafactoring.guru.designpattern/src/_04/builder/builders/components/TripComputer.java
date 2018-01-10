package _04.builder.builders.components;

import _04.builder.builders.cars.Car;

public class TripComputer {

    public void condition() {
        if (Engine.isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }

    public void fuelLevel() {
        System.out.println("Level of fuel - " + Car.getFuel());
    }
}