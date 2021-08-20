package demo.v2;

public class UnauthorizedUser extends Employee {

    public UnauthorizedUser(Mediator mediator, String name) {
        //The user is always treated an unauthorized user.So, the flag is
        //false always.
        super(mediator, name, false);
    }

    @Override
    public String employeeType() {
        return "UnauthorizedUser";
    }

    @Override
    public void receive(Employee fromEmployee, String message) {
        System.out.println(this.getName() + message);
    }
}
