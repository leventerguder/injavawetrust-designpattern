package demo.v2;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
