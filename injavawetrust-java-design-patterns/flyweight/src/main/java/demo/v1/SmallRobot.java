package demo.v1;

//A shared flyweight implementation
public class SmallRobot implements Robot {

    //Intrinsic state
    /*
    It is not supplied by client.
    So, it is independent of the flyweight's context.
    This can be shared across.
    These data are often immutable.
     */

    private final String robotTypeCreated;

    public SmallRobot() {
        robotTypeCreated = "A small robot created";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.print(" with " + color + " color");
    }


}
