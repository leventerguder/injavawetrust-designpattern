package demo.v1;

public class Nano extends BasicCar{

    private int basePrice=100000;
    public Nano(String m)
    {
        setModelName(m);
    }

    @Override
    public int getBasePrice() {
        return basePrice;
    }

    @Override
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
}
