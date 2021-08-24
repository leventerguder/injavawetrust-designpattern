package demo.v1.controller;

import demo.v1.model.Employee;

public interface Controller {

    void displayEnrolledEmployees();
    void addEmployee(Employee employee);
    void removeEmployee(String employeeId);
}
