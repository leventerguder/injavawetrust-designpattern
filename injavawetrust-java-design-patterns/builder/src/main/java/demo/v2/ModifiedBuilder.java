package demo.v2;

public interface ModifiedBuilder {

    ModifiedBuilder startUpOperations(String startUpMessage);
    ModifiedBuilder buildBody(String bodyType);
    ModifiedBuilder insertWheels(int noOfWheels);
    ModifiedBuilder addHeadlights(int noOfHeadLights);
    ModifiedBuilder endOperations(String endOperationsMessage);
    //Combine the parts and make the final product.
    ProductClass constructCar();
    //Optional method:To get the already constructed object
    ProductClass getConstructedCar();

}
