package demo.v1;

public class DecoratorPatternExample {

    public static void main(String[] args) {

        System.out.println("***Decorator pattern Demo***\n");
        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();
        System.out.println("_________________");

        //Using a decorator to add floor
        System.out.println("Using a Floor decorator now.");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(withoutDecorator);
        floorDecorator.makeHouse();
        System.out.println("_________________");

        //Using a decorator to add floor to original house and then paint it.
        System.out.println("Using a Paint decorator now.");
        PaintDecorator paintDecorator = new PaintDecorator();
        //Adding results from floor decorator
        paintDecorator.setComponent(floorDecorator);
        paintDecorator.makeHouse();
        System.out.println("_________________");
    }

}
