package demo.v1;

public class Ford extends BasicCar{

    private int basePrice=100000;
    public Ford(String m)
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
