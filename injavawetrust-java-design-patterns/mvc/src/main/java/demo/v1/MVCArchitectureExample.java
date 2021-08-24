package demo.v1;

import demo.v1.controller.Controller;
import demo.v1.controller.EmployeeController;
import demo.v1.model.Employee;
import demo.v1.model.EmployeeModel;
import demo.v1.model.Model;
import demo.v1.view.ConsoleView;
import demo.v1.view.MobileView;
import demo.v1.view.View;

public class MVCArchitectureExample {

    public static void main(String[] args) {

        System.out.println("***MVC architecture Demo***\n"); //Model
        Model model = new EmployeeModel();
        //View
        View view = new ConsoleView();
        //Controller
        Controller controller = new EmployeeController(model, view);
        controller.displayEnrolledEmployees();
        //Add an employee
        controller.addEmployee(new Employee("Kevin", "E4"));
        controller.displayEnrolledEmployees();
        //Remove an existing employee using the employee id.
        controller.removeEmployee("E2");
        controller.displayEnrolledEmployees();
        //Cannot remove an  employee who does not belong to the list.
        controller.removeEmployee("E5");
        controller.displayEnrolledEmployees();
        //Avoiding duplicate entry
        controller.addEmployee(new Employee("Kevin", "E4"));


        view = new MobileView();
        controller = new EmployeeController(model, view);
        controller.displayEnrolledEmployees();
    }

}
