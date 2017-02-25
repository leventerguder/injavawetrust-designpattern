package _03.abstract$.factory.pattern.model.mercedes;

import _03.abstract$.factory.pattern.model.Wheel;

public class MercedesWheel implements Wheel{

	@Override
	public void accelarate() {
		System.out.println("MercedesWheel#accelarate");
	}

}
