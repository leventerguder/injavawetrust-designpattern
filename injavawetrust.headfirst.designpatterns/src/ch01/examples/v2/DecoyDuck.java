package ch01.examples.v2;

public class DecoyDuck extends Duck {

    // but then what happens when we add wooden decoy ducks to the program ?
    // They arent supposed to fly or quack

    // Notice that it doesn't fly, but it also doesn't quack!

    @Override
    public void display() {
        System.out.println("DecoyDuck#display");
    }

    @Override
    public void quack() {
        // override to do nothing
    }

    @Override
    public void fly() {
        // override to do nothing
    }

}
