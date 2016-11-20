package _02.factory.method.pattern.model;

public class Fiat implements Car {

	@Override
	public String getModel() {
		return "Doblo Panorama";
	}

	@Override
	public double getPrice() {		
		return 70500;
	}

}