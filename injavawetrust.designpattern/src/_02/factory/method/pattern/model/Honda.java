package _02.factory.method.pattern.model;

public class Honda implements Car {

	@Override
	public String getModel() {		
		return "Civic";
	}

	@Override
	public double getPrice() {		
		return 95000;
	}

}