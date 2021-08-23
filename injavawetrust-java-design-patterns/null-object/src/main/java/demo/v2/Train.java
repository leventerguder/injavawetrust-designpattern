package demo.v2;

class Train implements Vehicle {
    public static int trainCount = 0;

    public Train() {
        trainCount++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel with a train");
    }
}
