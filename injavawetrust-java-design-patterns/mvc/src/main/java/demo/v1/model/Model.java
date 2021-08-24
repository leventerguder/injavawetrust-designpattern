package demo.v1.model;

import java.util.List;

public interface Model {

    List<Employee> getEnrolledEmployeeDetailsFromModel();
    void addEmployeeToModel(Employee employee);
    void removeEmployeeFromModel(String employeeId);

}
