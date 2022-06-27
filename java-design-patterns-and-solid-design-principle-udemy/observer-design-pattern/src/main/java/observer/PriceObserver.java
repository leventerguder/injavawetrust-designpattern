package observer;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double cost = order.getItemCost();

        if (cost >= 500) {
            order.setDiscount(50);
        } else if (cost >= 200) {
            order.setDiscount(10);
        }
    }


}
