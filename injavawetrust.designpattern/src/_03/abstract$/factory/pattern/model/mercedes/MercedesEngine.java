package _03.abstract$.factory.pattern.model.mercedes;

import _03.abstract$.factory.pattern.model.Engine;

public class MercedesEngine implements Engine{

	@Override
	public void startEngine() {
		System.out.println("MercedesEngine#startEngine ...");
	}

}
