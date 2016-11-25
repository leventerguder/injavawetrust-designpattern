package _02.factory.method.pattern.model;

public class Sedan implements Car {

	@Override
	public String getModel() {
		return "Sedan";
	}

	@Override
	public double getPrice() {
		return 2000;
	}

	@Override
	public void speedUp() {
		System.out.println("Sedan#speedUp");
	}

}
