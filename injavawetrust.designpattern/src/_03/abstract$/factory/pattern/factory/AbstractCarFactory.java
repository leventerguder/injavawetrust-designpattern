package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.Engine;
import _03.abstract$.factory.pattern.model.Wheel;

public interface AbstractCarFactory {

	public abstract Engine getEngineInstance();

	public abstract Wheel getWheelInstance();

}
