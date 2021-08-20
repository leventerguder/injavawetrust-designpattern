package demo.v1;

public class JuniorEmployee extends Employee {

    public JuniorEmployee(Mediator mediator, String name) {
        super(mediator);
        setName(name);
    }

    @Override
    public String employeeType() {
        return "JuniorEmployee";
    }
}
