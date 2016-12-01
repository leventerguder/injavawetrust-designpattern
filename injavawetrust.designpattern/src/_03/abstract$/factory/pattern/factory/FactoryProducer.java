package _03.abstract$.factory.pattern.factory;

public class FactoryProducer {

	public static AbstractCarFactory getFactory(FactoryType factoryType) {
		switch (factoryType) {
		case ENGINE_FACTORY:
			return new EngineFactory();
		case WHEEL_FACTORY:
			return new WheelFactory();
		}
		return null;
	}

}
