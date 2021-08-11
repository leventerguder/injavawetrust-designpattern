package demo.v3;

public class ModifiedIteratorPatternExample2 {

    public static void main(String[] args) {
        System.out.println("***Modified Iterator Pattern Demo. Example-2.***");
        DataBase employeesList = new EmployeeDatabase();

        EmployeeIterator iteratorForEmployee = employeesList.createIterator();
        System.out.println("\n -----Employee details are as follows-----\n");
        while (iteratorForEmployee.hasNext()) {
            System.out.println(iteratorForEmployee.next());
        }
    }

}
