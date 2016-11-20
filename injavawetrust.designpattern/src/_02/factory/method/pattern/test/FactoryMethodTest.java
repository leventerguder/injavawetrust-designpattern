package _02.factory.method.pattern.test;

import _02.factory.method.pattern.factory.CarFactory;
import _02.factory.method.pattern.model.Car;
import _02.factory.method.pattern.model.CarBrand;

public class FactoryMethodTest {

	public static void main(String[] args) {

		Car fiat = CarFactory.getCarInstance(CarBrand.FIAT);
		System.out.println(fiat.getModel());
		System.out.println(fiat.getPrice());
		System.out.println();

		Car ford = CarFactory.getCarInstance(CarBrand.FORD);
		System.out.println(ford.getModel());
		System.out.println(ford.getPrice());
		System.out.println();

		Car honda = CarFactory.getCarInstance(CarBrand.HONDA);
		System.out.println(honda.getModel());
		System.out.println(honda.getPrice());
		System.out.println();
	}
}
