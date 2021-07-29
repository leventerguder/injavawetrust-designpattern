package demo.v1;

public class WildDog implements Dog {

    @Override
    public void speak() {
        System.out.println("Wild Dog says loudly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Dogs prefer to roam freely in jungles.\n");
    }
}
