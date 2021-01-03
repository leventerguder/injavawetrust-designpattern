package _01._06.singleton.billpugh;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    //Thread Safe
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
