package demo.v1;

public class PetAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger() {
        return new PetTiger();
    }

}
