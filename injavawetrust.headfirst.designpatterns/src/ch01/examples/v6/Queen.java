package ch01.examples.v6;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Queen#fight");
    }

}
