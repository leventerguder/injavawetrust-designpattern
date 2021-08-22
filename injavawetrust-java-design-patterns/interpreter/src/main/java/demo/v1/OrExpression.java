package demo.v1;

public class OrExpression implements Employee {

    private Employee emp1;
    private Employee emp2;

    public OrExpression(Employee emp1, Employee emp2) {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    @Override
    public boolean interpret(Context context) {
        return emp1.interpret(context) || emp2.interpret(context);
    }
}
