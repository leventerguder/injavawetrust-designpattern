package demo.v1;

public class TigerFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
