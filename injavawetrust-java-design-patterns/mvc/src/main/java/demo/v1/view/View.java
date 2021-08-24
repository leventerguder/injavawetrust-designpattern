package demo.v1.view;

import demo.v1.model.Employee;

import java.util.List;

public interface View {
    void showEnrolledEmployees(List<Employee> enrolledEmployees);
}
