package _03.abstract$.factory.pattern.model.bmw;

import _03.abstract$.factory.pattern.model.Engine;

public class BMWEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("BMWEngine#startEngine ...");
	}

}
