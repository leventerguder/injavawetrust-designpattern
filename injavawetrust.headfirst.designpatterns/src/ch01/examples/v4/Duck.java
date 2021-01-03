package ch01.examples.v4;

public abstract class Duck {

    // The key is that a Duck will now delegate its flying and quacking behavior ,
    // instead of using quacking and flying methods defined in the Duck class (or
    // subclass)

    // The behavior variables are declared as the behavior INTERFACE type.
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    // Each Duck has a reference to something that implements the QuackBehavior
    // interface

    public abstract void display();

    // These methods replace fly() and quack()
    public void perfomFly() {
        flyBehavior.fly();
    }

    // Rather than handling the quack behavior itself, the Duck object delegates
    // that behavior to the object referenced by quackBehavior
    public void performQuack() {
        quackBehavior.quack();
    }

    // other duck-like methods...
}
