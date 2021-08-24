package demo.v1.view;

import demo.v1.model.Employee;

import java.util.List;

public class MobileView implements View {

    @Override
    public void showEnrolledEmployees(List<Employee> enrolledEmployees) {
        System.out.println("\n ***This is a mobile view of currently enrolled employees.*** ");
        System.out.println("Employee Id" + "\t" + " Employee Name");
        System.out.println("______________________");
        for (Employee employee : enrolledEmployees) {
            System.out.println(employee.getEmpId() + "\t" +
                    employee.getEmpName());
        }
        System.out.println("---------------------");
    }
}
