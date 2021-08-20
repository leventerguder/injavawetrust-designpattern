package demo.v1;

public class SeniorEmployee extends Employee {

    public SeniorEmployee(Mediator mediator, String name) {
        super(mediator);
        setName(name);
    }

    @Override
    public String employeeType() {
        return "SeniorEmployee";
    }


}
