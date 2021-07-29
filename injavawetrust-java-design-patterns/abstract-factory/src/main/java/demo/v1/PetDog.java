package demo.v1;

public class PetDog implements Dog{
    @Override
    public void speak() {
        System.out.println("Pet Dog says softly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Dogs prefer to stay at home.\n");
    }
}
