package demo.v1;

public class Bus implements Vehicle{

    public static int busCount;

    public Bus() {
        busCount++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel with a bus");
    }
}
