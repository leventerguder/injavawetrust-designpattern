package ch01.examples.v6;

public class King extends Character {

    public King() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King#fight");
    }

}
