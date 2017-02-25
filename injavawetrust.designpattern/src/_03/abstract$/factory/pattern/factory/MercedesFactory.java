package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.Engine;
import _03.abstract$.factory.pattern.model.Wheel;
import _03.abstract$.factory.pattern.model.mercedes.MercedesEngine;
import _03.abstract$.factory.pattern.model.mercedes.MercedesWheel;

public class MercedesFactory implements AbstractCarFactory {

	private MercedesFactory() {

	}

	private static class SingletonHelper {
		private final static MercedesFactory INSTANCE = new MercedesFactory();
	}

	public static MercedesFactory getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	@Override
	public Engine getEngineInstance() {
		return new MercedesEngine();
	}

	@Override
	public Wheel getWheelInstance() {
		return new MercedesWheel();
	}
}
