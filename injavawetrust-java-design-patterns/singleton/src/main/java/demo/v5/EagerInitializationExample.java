package demo.v5;

public class EagerInitializationExample {
    public static void main(String[] args) {

        Captain.dummyMethod();

        /*
        Notice that A captain is elected for your team still appears in the output,
        though you may have no intention to deal with that.
        So, in the preceding situation, an object of the Singleton class is always instantiated.
         */
    }
}
