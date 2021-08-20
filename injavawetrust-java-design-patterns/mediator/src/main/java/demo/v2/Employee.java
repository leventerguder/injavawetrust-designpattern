package demo.v2;

public abstract class Employee {

    private Mediator mediator;
    private String name;
    private boolean authorizedUser;

    public Employee(Mediator mediator, String name, boolean authorizedUser) {
        this.mediator = mediator;
        this.name = name;
        this.authorizedUser = authorizedUser;
        if (authorizedUser)
            mediator.register(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void send(Employee toFriend,String msg) throws InterruptedException
    {
        mediator.sendMessage(this,toFriend, msg);
    }

    public void receive(Employee fromFriend, String message) {
        System.out.println(this.name + " received a message : " + message +
                " from an employee " + fromFriend.getName() + ".");
    }


    public abstract String employeeType();

}
