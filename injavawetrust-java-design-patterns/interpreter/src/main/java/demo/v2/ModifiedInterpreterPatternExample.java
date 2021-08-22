package demo.v2;

public class ModifiedInterpreterPatternExample {

    public static void main(String[] args) {
        System.out.println("***Modified Interpreter Pattern Demo***\n");
        //Minimum Criteria for promoton is:
        //The year of experience is minimum 10 yrs. and
        //Employee grade should be either G2 or G3
        Context context = new Context(10, "G2", "G3");
        //Different Employees with grades
        Employee emp1 = new IndividualEmployee(5, "G1");
        Employee emp2 = new IndividualEmployee(10, "G2");
        Employee emp3 = new IndividualEmployee(15, "G3");
        Employee emp4 = new IndividualEmployee(20, "G4");
        EmployeeBuilder builder = new EmployeeBuilder();

        System.out.println("Is emp1 and any of emp2,emp3, emp4 is eligible for promotion?"
                + builder.buildTree(emp1, emp2, emp3, emp4).interpret(context));
        System.out.println("Is emp2 and any of emp1,emp3, emp4 is eligible for promotion?"
                + builder.buildTree(emp2, emp1, emp3, emp4).interpret(context));
        System.out.println("Is emp3 and any of emp1,emp2, emp3 is eligible for promotion?"
                + builder.buildTree(emp3, emp1, emp2, emp4).interpret(context));

        System.out.println("Is emp4 and any of emp1,emp2, emp3 is eligible for promotion?"
                + builder.buildTree(emp4, emp1, emp2, emp3).interpret(context));
        System.out.println("");
        //Validating the 2nd complex rule
        System.out.println("Is emp1 or (emp2 but not emp3) is eligible for promotion?"
                + builder.buildTreeBasedOnRule2(emp1, emp2, emp3).interpret(context));
        System.out.println("Is emp2 or (emp3 but not emp4) is eligible for promotion?"
                + builder.buildTreeBasedOnRule2(emp2, emp3, emp4).interpret(context));
    }

}
