package demo.v1;

public abstract class Employee {

    private Mediator mediator;
    private String name;


    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String msg) throws InterruptedException {
        mediator.sendMessage(this, msg);
    }

    public abstract String employeeType();
}
