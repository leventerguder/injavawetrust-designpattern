package demo.v2;

public class Proxy extends Subject {

    private static Subject cs;
    protected static int count = 0; // A counter to trach the number of instances.

    public Proxy(){

        cs = new ConcreteSubject();

        count++;
    }

    @Override
    public void doSomeWork() {

        System.out.println("Proxy call happening now...");
        cs.doSomeWork();
    }
}
