package demo.v1;

public class WildAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }

}
