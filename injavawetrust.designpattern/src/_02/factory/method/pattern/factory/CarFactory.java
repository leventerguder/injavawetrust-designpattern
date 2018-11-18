package _02.factory.method.pattern.factory;

import _02.factory.method.pattern.model.Car;
import _02.factory.method.pattern.model.CarType;
import _02.factory.method.pattern.model.Hatchback;
import _02.factory.method.pattern.model.Sedan;
import _02.factory.method.pattern.model.StationWagon;

public class CarFactory {

	public static Car getCarInstance(CarType carType) {

		switch (carType) {
		case HATCHBACK:
			return new Hatchback();
		case SEDAN:
			return new Sedan();
		case STATION_WAGON:
			return new StationWagon();
		default:
			return null;
		}
		
		// we can use switch-case or if-else

//		if (CarType.HATCHBACK == carType) {
//			return new Hatchback();
//		} else if (CarType.SEDAN == carType) {
//			return new Sedan();
//		} else if (CarType.STATION_WAGON == carType) {
//			return new StationWagon();
//		} else {
//			return null;
//		}

	}
}
