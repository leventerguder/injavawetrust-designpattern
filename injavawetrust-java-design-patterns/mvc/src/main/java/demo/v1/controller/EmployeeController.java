package demo.v1.controller;

import demo.v1.model.Employee;
import demo.v1.model.Model;
import demo.v1.view.View;

import java.util.List;

public class EmployeeController implements Controller {

    private Model model;
    private View view;

    public EmployeeController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void displayEnrolledEmployees() {

        //Get data from Model
        List<Employee> enrolledEmployees = model.getEnrolledEmployeeDetailsFromModel();
        //Connect to View
        view.showEnrolledEmployees(enrolledEmployees);
    }

    @Override
    public void addEmployee(Employee employee) {
        model.addEmployeeToModel(employee);
    }

    @Override
    public void removeEmployee(String employeeId) {
        model.removeEmployeeFromModel(employeeId);
    }
}
