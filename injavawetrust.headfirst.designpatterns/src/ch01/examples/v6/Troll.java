package ch01.examples.v6;

public class Troll extends Character {

    public Troll() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll#fight");
    }

}
