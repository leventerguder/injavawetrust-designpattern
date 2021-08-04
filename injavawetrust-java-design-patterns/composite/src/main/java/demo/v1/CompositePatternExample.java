package demo.v1;

public class CompositePatternExample {

    public static void main(String[] args) {

        System.out.println("***Composite Pattern Demo ***");
        //2 teachers other than HOD works in Mathematics department
        Employee mathTeacher1 = new Employee("Math Teacher-1", "Maths");
        Employee mathTeacher2 = new Employee("Math Teacher-2", "Maths");

        //teachers other than HOD works in Computer Sc. Department
        Employee cseTeacher1 = new Employee("CSE Teacher-1", "Computer Sc.");
        Employee cseTeacher2 = new Employee("CSE Teacher-2", "Computer Sc.");
        Employee cseTeacher3 = new Employee("CSE Teacher-3", "Computer Sc.");

        //The College has 2 Head of Departments-One from Mathematics, One from Computer Sc.

        CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HOD- Maths)", "Maths");
        CompositeEmployee hodCompSc = new CompositeEmployee("Mr. V.Sarcar(HOD-CSE)", "Computer Sc.");

        //Principal of the college
        CompositeEmployee principal = new CompositeEmployee("Dr.S.Som (Principal)", "Planning-Supervising-Managing");

        //Teachers of Computer Sc. directly reports to HOD-CSE
        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);

        // Principal is on top of college.HOD -Maths and Comp. Sc directly reports to him

        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCompSc);

        // Printing the leaf-nodes and branches in the same way i.e. in each case,
        // we are calling PrintStructures() method

        System.out.println("\n Testing the structure of a Principal object");
        //Prints the complete structure
        principal.printStructures();
        System.out.println("At present Principal has control over " + principal.getEmployeeCount() + " number of employees.");


        System.out.println("\n Testing the structure of a HOD-CSE object:");
        //Prints the details of Computer Sc, department
        hodCompSc.printStructures();
        System.out.println("At present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees.");

        System.out.println("\n Testing the structure of a HOD-Maths object:");
        //Prints the details of Mathematics department hodMaths.printStructures();
        System.out.println("At present HOD-Maths has control over " + hodMaths.getEmployeeCount() + " number of employees.");

        //Leaf node
        System.out.println("\n Testing the structure of a leaf node:");
        mathTeacher1.printStructures();
        System.out.println("At present Math Teacher-1 has control over " + mathTeacher1.getEmployeeCount() + " number of employees.");

        // Suppose, one computer teacher is leaving now from the organization

        hodCompSc.removeEmployee(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 resigned, the organization has following members:");
        principal.printStructures();
        System.out.println("At present Principal has control over " + principal.getEmployeeCount() + " number of employees");
        System.out.println("At present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees");
        System.out.println("At present HOD-Maths has control over " + hodMaths.getEmployeeCount() + " number of employees");
    }

}
