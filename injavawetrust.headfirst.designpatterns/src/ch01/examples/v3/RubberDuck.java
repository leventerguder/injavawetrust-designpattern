package ch01.examples.v3;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("RubberDuck#display");
        // looks like a rubberduck
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck#quack");
    }
}
