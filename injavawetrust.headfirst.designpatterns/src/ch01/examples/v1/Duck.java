package ch01.examples.v1;

public abstract class Duck {

    /*
     * Joe works for a company that makes a highly successful duck pond simulation
     * game , SimUDuck The game can show a large variety of duck species swimming
     * and making quacking sounds. The initial designers of the system used standard
     * OO techniques and created one Duck superclass from which all other duck types
     * inherit
     */

    // All ducks quack and swim ,the Duck class takes care of the implementation
    // code
    public void quack() {
        System.out.println("Duck#quack...");
    }

    public void swim() {
        System.out.println("Duck#swim...");
    }

    // The display method is abstract , since all duck subtypes look different.
    public abstract void display();

    // Each duck subtype is responsible for implementing its own display() behavior
    // for how it looks on the screen.

}
