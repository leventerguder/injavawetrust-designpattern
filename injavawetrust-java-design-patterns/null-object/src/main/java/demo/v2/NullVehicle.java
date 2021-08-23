package demo.v2;

public class NullVehicle implements Vehicle {

    private static NullVehicle instance = new NullVehicle();
    public static int nullVehicleCount;

    public NullVehicle() {
        nullVehicleCount++;
        System.out.println(" A null vehicle object created.Currently null vehicle count is : " + nullVehicleCount);
    }

    @Override
    public void travel() {
        //Do Nothing
    }

    // Apart from the initial case, notice that object count has not increased due to null vehicle objects or invalid input.

    public static NullVehicle getInstance() {
        System.out.println("We already have an instance now. Use it.");
        return instance;
    }
}
