package demo.v2;

public class ConcreteEmployee extends Employee {

    public ConcreteEmployee(Mediator mediator, String name, boolean
            authorizedUser) {
        super(mediator, name, authorizedUser);
    }

    @Override
    public String employeeType() {
        return "ConcreteEmployee";
    }
}
