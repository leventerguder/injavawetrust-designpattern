package _02.factory.method.pattern.factory;

import _02.factory.method.pattern.model.Car;
import _02.factory.method.pattern.model.CarBrand;
import _02.factory.method.pattern.model.Fiat;
import _02.factory.method.pattern.model.Ford;
import _02.factory.method.pattern.model.Honda;

public class CarFactory {

	public static Car getCarInstance(CarBrand brand) {

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

		//we can use switch-case or if-else
		
		// if (CarBrand.FIAT == brand) {
		// return new Fiat();
		// } else if (CarBrand.FORD == brand) {
		// return new Ford();
		// } else if (CarBrand.HONDA == brand) {
		// return new Honda();
		// } else {
		// return null;
		// }
	}
}
