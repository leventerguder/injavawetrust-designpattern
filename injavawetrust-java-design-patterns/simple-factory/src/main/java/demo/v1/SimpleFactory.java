package demo.v1;

public class SimpleFactory {

    public Animal createAnimal(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Type can not be null value.");
        }

        Animal animal = null;
        switch (type) {
            case "Dog":
                animal = new Dog();
                break;
            case "Tiger":
                animal = new Tiger();
                break;
            default:
                throw new IllegalArgumentException("Invalid Animal Type");
        }
        return animal;
    }
}
