package _02.factory.method.pattern.model;

public class Ford implements Car {

	@Override
	public String getModel() {
		return "Mustang";
	}

	@Override
	public double getPrice() {
		return 150000;
	}

}