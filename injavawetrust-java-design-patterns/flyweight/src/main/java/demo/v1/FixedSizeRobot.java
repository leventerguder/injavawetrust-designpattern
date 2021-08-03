package demo.v1;

public class FixedSizeRobot implements Robot {

    /*
     * Intrinsic state.
     * It is not supplied by client.
     * So, it is independent of the flyweight’s context.
     * This can be shared across.
     */
    private final String robotTypeCreated;

    public FixedSizeRobot() {
        robotTypeCreated = "A robot with a fixed size created";
        System.out.print(robotTypeCreated);
    }

    // Ignoring the extrinsic state argument
    // Since it is an unshared flyweight
    @Override
    public void showMe(String color) {
        System.out.print(" with " + " blue (default) color");
    }
}
