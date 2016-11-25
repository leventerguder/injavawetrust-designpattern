package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.engine.Engine;
import _03.abstract$.factory.pattern.model.engine.EngineType;
import _03.abstract$.factory.pattern.model.wheel.Wheel;
import _03.abstract$.factory.pattern.model.wheel.WheelType;
import _03.abstract$.factory.pattern.model.engine.HEngine;
import _03.abstract$.factory.pattern.model.engine.LEngine;
import _03.abstract$.factory.pattern.model.engine.VEngine;

public class EngineFactory extends AbstractCarFactory {
    @Override
    public Engine getEngineInstance(EngineType engineType) {
        switch (engineType) {
        case H:
            return new HEngine();
        case L:
            return new LEngine();
        case V:
            return new VEngine();
        }
        return null;
    }

    @Override
    public Wheel getWheelInstance(WheelType wheeltype) {
        // TODO Auto-generated method stub
        return null;
    }
}
