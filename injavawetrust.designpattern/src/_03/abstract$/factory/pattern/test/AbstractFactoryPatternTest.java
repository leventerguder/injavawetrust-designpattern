package _03.abstract$.factory.pattern.test;

import _03.abstract$.factory.pattern.factory.FactoryType;
import _03.abstract$.factory.pattern.factory.FactoryProducer;
import _03.abstract$.factory.pattern.factory.AbstractCarFactory;
import _03.abstract$.factory.pattern.model.engine.Engine;
import _03.abstract$.factory.pattern.model.engine.EngineType;
import _03.abstract$.factory.pattern.model.wheel.Wheel;
import _03.abstract$.factory.pattern.model.wheel.WheelType;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        
        AbstractCarFactory engineFactory = FactoryProducer.getFactory(FactoryType.ENGINE_FACTORY);
        Engine engine = engineFactory.getEngineInstance(EngineType.H);
       
        //
        AbstractCarFactory wheelFactory = FactoryProducer.getFactory(FactoryType.WHEEL_FACTORY);
        Wheel wheel = wheelFactory.getWheelInstance(WheelType.ALLOY);
        
        
        System.out.println(engine.getEngineModel());
        System.out.println(wheel.getPrice());
        
        //
        engine = engineFactory.getEngineInstance(EngineType.L);
        wheel = wheelFactory.getWheelInstance(WheelType.WIRE);
        
        
        System.out.println(engine.getEngineModel());
        System.out.println(wheel.getPrice());
    }
}
