package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.Engine;
import _03.abstract$.factory.pattern.model.Wheel;
import _03.abstract$.factory.pattern.model.bmw.BMWEngine;
import _03.abstract$.factory.pattern.model.bmw.BMWWheel;

public class BMWFactory implements AbstractCarFactory {

	private BMWFactory() {

	}

	private static class SingletonHelper {
		private static final BMWFactory INSTANCE = new BMWFactory();
	}

	// Thread Safe
	public static BMWFactory getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Engine getEngineInstance() {
		return new BMWEngine();
	}

	@Override
	public Wheel getWheelInstance() {
		return new BMWWheel();
	}
}
