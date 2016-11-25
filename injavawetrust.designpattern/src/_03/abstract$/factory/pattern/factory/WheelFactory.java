package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.engine.Engine;
import _03.abstract$.factory.pattern.model.engine.EngineType;
import _03.abstract$.factory.pattern.model.wheel.Wheel;
import _03.abstract$.factory.pattern.model.wheel.WheelType;
import _03.abstract$.factory.pattern.model.wheel.Alloy;
import _03.abstract$.factory.pattern.model.wheel.Wire;

public class WheelFactory extends AbstractCarFactory {
    @Override
    public Wheel getWheelInstance(WheelType wheeltype) {
        switch (wheeltype) {
        case ALLOY:
            return new Alloy();
        case WIRE:
            return new Wire();
        }
        return null;
    }

    @Override
    public Engine getEngineInstance(EngineType engineType) {
        // TODO Auto-generated method stub
        return null;
    }
}
