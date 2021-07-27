package demo.v2;

public class ModifiedFactoryMethodPatternExample {

    public static void main(String[] args) {

        // Creating a Tiger Factory
        AnimalFactory tigerFactory = new TigerFactory();
        // Creating a tiger using the Factory Method
        Animal aTiger = tigerFactory.makeAnimal();

        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.makeAnimal();

    }
}
