package demo.v1;

public class ConcreteSubject extends Subject{
    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
    }
}
