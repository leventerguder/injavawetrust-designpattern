package ch01.examples.v5;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
        //Quack that really quack
    }

}
