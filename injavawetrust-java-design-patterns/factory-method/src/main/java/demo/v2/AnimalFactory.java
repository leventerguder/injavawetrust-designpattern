package demo.v2;

public abstract class AnimalFactory {

    public Animal makeAnimal() {
        System.out.println("I am inside makeAnimal() of AnimalFactory.You cannot ignore my rules.");

        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }

    public abstract Animal createAnimal();

}
