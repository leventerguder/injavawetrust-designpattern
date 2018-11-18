package _02.factory.method.pattern.model;

public class Hatchback implements Car {

	@Override
	public String getModel() {
		return "Hatchback";
	}

	@Override
	public double getPrice() {
		return 1000;
	}

	@Override
	public void speedUp() {
		System.out.println("Hatchback#speedUp");
	}

}
