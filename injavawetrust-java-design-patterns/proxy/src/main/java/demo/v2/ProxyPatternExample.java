package demo.v2;

public class ProxyPatternExample {
    public static void main(String[] args) {

        System.out.println("***Proxy Pattern Demo without lazy instantiation***\n");

        Proxy px = new Proxy();
        px.doSomeWork();

        //2nd proxy instance
        Proxy px2 = new Proxy();
        px2.doSomeWork();

        System.out.println("Instance Count=" + Proxy.count);
    }
}
