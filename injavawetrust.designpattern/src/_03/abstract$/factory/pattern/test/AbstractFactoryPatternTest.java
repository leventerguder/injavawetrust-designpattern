package _03.abstract$.factory.pattern.test;

import _03.abstract$.factory.pattern.factory.AbstractCarFactory;
import _03.abstract$.factory.pattern.factory.BMWFactory;
import _03.abstract$.factory.pattern.factory.MercedesFactory;
import _03.abstract$.factory.pattern.model.Engine;
import _03.abstract$.factory.pattern.model.Wheel;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {

		AbstractCarFactory bmwFactory = BMWFactory.getInstance();

		Engine bmwEngine = bmwFactory.getEngineInstance();
		Wheel bmwWheel = bmwFactory.getWheelInstance();

		AbstractCarFactory mercedesFactory = MercedesFactory.getInstance();

		Engine mercedesEngine = mercedesFactory.getEngineInstance();
		Wheel mercedesWheel = mercedesFactory.getWheelInstance();

		
		bmwEngine.startEngine();
		bmwWheel.accelarate();
		
		mercedesEngine.startEngine();
		mercedesWheel.accelarate();
	}
}
