package demo.v1;

public class ObserverType1 implements Observer {

    private String nameOfObserver;

    public ObserverType1(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println(nameOfObserver + " has received an alert: Updated myValue in Subject is:" + updatedValue);
    }
}
