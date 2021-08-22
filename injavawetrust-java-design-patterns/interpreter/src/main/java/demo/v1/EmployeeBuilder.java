package demo.v1;

public class EmployeeBuilder {
    public Employee buildExpression(Employee emp1, String operator, Employee emp2) {

        //Whatever the input,converting it to lowercase
        switch (operator.toLowerCase()) {
            case "or":
                return new OrExpression(emp1, emp2);
            case "and":
                return new AndExpression(emp1, emp2);
            case "not":
                return new NotExpression(emp1);
            default:
                System.out.println("Only AND,OR and NOT operators are allowed at present");
                return null;
        }

    }
}
