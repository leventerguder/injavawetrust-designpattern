package demo.v1;

public class SimpleFactoryPatternExample {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        Animal animal = simpleFactory.createAnimal("Dog");

        animal.speak();
        animal.preferredAction();

    }
}
