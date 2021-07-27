package demo.v2;

public class ProductClass {

    private String startUpMessage;
    private String bodyType;
    private int noOfWheels;
    private int noOfHeadLights;
    private String endOperationsMessage;

    public ProductClass(final String startUpMessage, String bodyType,
                        int noOfWheels, int noOfHeadLights,
                        String endOperationsMessage) {
        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.noOfWheels = noOfWheels;
        this.noOfHeadLights = noOfHeadLights;
        this.endOperationsMessage = endOperationsMessage;
    }

    /*
    There is no setter methods used here to promote immutability.
    Since the attributes are private and there is no setter methods, the
    keyword "final" is not needed to attach with the attributes.
    */

    @Override
    public String toString() {
        return "ProductClass{" +
                "startUpMessage='" + startUpMessage + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", noOfHeadLights=" + noOfHeadLights +
                ", endOperationsMessage='" + endOperationsMessage + '\'' +
                '}';
    }
}
