package demo.v3;

public class ProxyPatternExample {
    public static void main(String[] args) {

        System.out.println("*** Proxy Pattern Demo***\n");
        //Admin is an authorized user
        Proxy px1 = new Proxy("Admin");
        px1.doSomeWork();
        //Robin is an unauthorized user
        Proxy px2 = new Proxy("Robin");
        px2.doSomeWork();

    }
}
