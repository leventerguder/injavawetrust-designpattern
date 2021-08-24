package demo.v1.model;

import java.util.Objects;

public class Employee {

    private String empName;
    private String empId;

    public Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empName, employee.empName) && Objects.equals(empId, employee.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empId);
    }
}
