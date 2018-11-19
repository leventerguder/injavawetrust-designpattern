package ch01.examples.v5;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.perfomFly();

		Duck model = new ModelDuck();
		model.perfomFly();
		model.setFlyBehavior(new FlyRockedPowered());
		model.perfomFly();

		// To change a duck's behavior at runtime , just call the duck's setter method
		// for that behavior.
	}
}
