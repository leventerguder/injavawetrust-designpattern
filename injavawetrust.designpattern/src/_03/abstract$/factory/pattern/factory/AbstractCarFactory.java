package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.engine.Engine;
import _03.abstract$.factory.pattern.model.wheel.Wheel;
import _03.abstract$.factory.pattern.model.engine.EngineType;
import _03.abstract$.factory.pattern.model.wheel.WheelType;

public abstract class AbstractCarFactory {
    
    public abstract Engine getEngineInstance(EngineType engineType);

    public abstract Wheel getWheelInstance(WheelType wheeltype);
    
}
