package _02.factory.method.pattern.factory;

import _02.factory.method.pattern.model.Car;
import _02.factory.method.pattern.model.CarBrand;
import _02.factory.method.pattern.model.Fiat;
import _02.factory.method.pattern.model.Ford;
import _02.factory.method.pattern.model.Honda;

public class CarFactory {

	public static Car getCar(CarBrand brand) {

		switch (brand) {
		case FIAT:
			return new Fiat();
		case FORD:
			return new Ford();
		case HONDA:
			return new Honda();
		default:
			return null;
		}

		// if ("fiat".equals(brand)) {
		// return new Fiat();
		// } else if ("ford".equals(brand)) {
		// return new Ford();
		// } else if ("honda".equals(brand)) {
		// return new Honda();
		// }
		// return null;
	}
}
