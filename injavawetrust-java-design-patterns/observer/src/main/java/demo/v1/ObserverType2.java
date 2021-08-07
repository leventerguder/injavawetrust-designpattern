package demo.v1;

public class ObserverType2 implements Observer {

    private String nameOfObserver;

    public ObserverType2(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println( nameOfObserver+" has received an alert: The current value of myValue in Subject is: "+ updatedValue);
    }
}
