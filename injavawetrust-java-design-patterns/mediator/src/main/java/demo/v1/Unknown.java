package demo.v1;

public class Unknown extends Employee {


    public Unknown(Mediator mediator, String name) {
        super(mediator);
        setName(name);
    }

    @Override
    public String employeeType() {
        return "Outsider";
    }
}
