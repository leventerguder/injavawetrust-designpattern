package ch01.examples.v4;

public class MallardDuck extends Duck {

    // Wait a second , did'nt you say we should NOT program to an implementation ?
    // But what are we doing in that constructor ? We are making a new instance of a
    // concrete Quack implementation class

    // Later, we will have more patterns in our toolbox that can help us fix it!
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    // A mallardDuck uses the Quack class to handle its quack , so when performQuack
    // is called the responsibility for the quack is delegated to the Quack object
    // and we get a real quack.

    // And it uses FlyWithWings as its FlyBehavior type

    @Override
    public void display() {
        System.out.println("I am real Mallard duck");
    }

    // So MallardDuck's quack is a real live duck quack , not a squeak and not a
    // mute quack.
}
