package demo.v1.view;

import demo.v1.model.Employee;

import java.util.List;

public class ConsoleView implements View {

    @Override
    public void showEnrolledEmployees(List<Employee> enrolledEmployees) {
        System.out.println("\n ***This is a console view of currently enrolled employees.*** ");
        for (Employee employee : enrolledEmployees) {
            System.out.println(employee);
        }
        System.out.println("---------------------");
    }

}
