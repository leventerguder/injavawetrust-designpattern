package demo.v1;

public class MotorCycle implements Builder {

    private String brandName;
    private Product product;

    public MotorCycle(String brand) {
        this.brandName = brand;
        this.product = new Product();

    }

    @Override
    public void startUpOperations() {
        //Nothing in this case
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 Headlights are added");
    }

    @Override
    public void endOperations() {
        //Finishing up with brand name
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
