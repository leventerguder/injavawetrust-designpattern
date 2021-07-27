package demo.v1;

public interface Builder {

    void startUpOperations();

    void buildBody();

    void insertWheels();

    void addHeadlights();

    void endOperations();

    /*The following method is used to retrieve the object that is constructed.*/
    Product getVehicle();
}
