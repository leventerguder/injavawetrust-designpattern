package _02.factory.method.pattern.test;

import _02.factory.method.pattern.factory.CarFactory;
import _02.factory.method.pattern.model.Car;
import _02.factory.method.pattern.model.CarType;

public class FactoryMethodTest {

    public static void main(String[] args) {

        Car sedan = CarFactory.getCarInstance(CarType.SEDAN);
        System.out.println(sedan.getModel());
        System.out.println(sedan.getPrice());
        sedan.speedUp();
        System.out.println();

        Car hatchback = CarFactory.getCarInstance(CarType.HATCHBACK);
        System.out.println(hatchback.getModel());
        System.out.println(hatchback.getPrice());
        hatchback.speedUp();
        System.out.println();

        Car stationWagon = CarFactory.getCarInstance(CarType.STATION_WAGON);
        System.out.println(stationWagon.getModel());
        System.out.println(stationWagon.getPrice());
        stationWagon.speedUp();
        System.out.println();

    }
}
