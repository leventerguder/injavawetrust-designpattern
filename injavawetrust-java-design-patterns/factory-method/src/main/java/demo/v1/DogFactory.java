package demo.v1;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
