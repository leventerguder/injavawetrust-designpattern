package nullobject;

public class Client {

    public static void main(String[] args) {
        ComplexService service1 = new ComplexService("Simple report 1", new StorageService());
        ComplexService service2 = new ComplexService("Simple report 2", new NullStorageService());

        service1.generateReport();
        System.out.println();
        service2.generateReport();
    }

}
