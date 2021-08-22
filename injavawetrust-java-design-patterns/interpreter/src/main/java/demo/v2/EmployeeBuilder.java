package demo.v2;

public class EmployeeBuilder {

    // Building the tree
    //Complex Rule-1: emp1 and (emp2 or (emp3 or emp4))
    public Employee buildTree(Employee emp1, Employee emp2, Employee
            emp3, Employee emp4) {
        //emp3 or emp4
        Employee firstPhase = new OrExpression(emp3, emp4);
        //emp2 or (emp3 or emp4)
        Employee secondPhase = new OrExpression(emp2, firstPhase);
        //emp1 and (emp2 or (emp3 or emp4))
        return new AndExpression(emp1, secondPhase);
    }

    //Complex Rule-2: emp1 or (emp2 and (not emp3 ))
    public Employee buildTreeBasedOnRule2(Employee emp1, Employee
            emp2, Employee emp3) {
        //Not emp3
        Employee firstPhase = new NotExpression(emp3);
        //emp2 or (not emp3)
        Employee secondPhase = new AndExpression(emp2, firstPhase);
        //emp1 and (emp2 or(not emp3))
        return new OrExpression(emp1, secondPhase);
    }
}
