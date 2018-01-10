package _04.builder.builders.demo;

import _04.builder.builders.CarBuilder;
import _04.builder.builders.CarManualBuilder;
import _04.builder.builders.cars.Car;
import _04.builder.builders.cars.Manual;
import _04.builder.builders.director.Director;

public class Demo {

	public static void main(String[] args) {
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders
		// and products.
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getType());

		CarManualBuilder manualBuilder = new CarManualBuilder();

		// Director may know several building recipes.
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}
}
