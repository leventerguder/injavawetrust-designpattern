package demo.v1;

import java.util.Random;

public abstract class BasicCar  implements Cloneable{

    private String modelName;
    private int basePrice;
    private int onRoadPrice;

    public static int setAdditionalPrice()
    {
        int price = 0;
        Random r = new Random();
        //We will get an integer value in the range 0 to 100000
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException
    {
        return  (BasicCar)super.clone();
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getOnRoadPrice() {
        return onRoadPrice;
    }

    public void setOnRoadPrice(int onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
    }
}
