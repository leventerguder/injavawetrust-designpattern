package demo.v1;

public class Car implements Builder {

    private String brandName;
    private Product product;

    public Car(String brandName) {
        this.brandName = brandName;
        this.product = new Product();
    }

    @Override
    public void startUpOperations() {
        //Starting with brand name
        product.add(String.format("Car model is :%s", this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 Headlights are added");
    }

    @Override
    public void endOperations() {
        //Nothing in this case
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
