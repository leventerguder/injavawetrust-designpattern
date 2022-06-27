package observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("101");
        PriceObserver price = new PriceObserver();
        order.attach(price);

        QuantityObserver quantity = new QuantityObserver();
        order.attach(quantity);

        order.addItem(50);
        order.addItem(179);

        System.out.println(order);
    }

}
