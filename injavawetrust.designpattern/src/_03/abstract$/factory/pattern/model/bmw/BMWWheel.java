package _03.abstract$.factory.pattern.model.bmw;

import _03.abstract$.factory.pattern.model.Wheel;

public class BMWWheel implements Wheel {

	@Override
	public void accelarate() {
		System.out.println("BMWWheel#accelarate ...");
	}

}
