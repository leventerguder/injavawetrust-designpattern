package demo.v2;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {

    private String name;
    private String dept;
    //New field for this example.
    //It is tagged with "final", so visitor cannot modify it.
    private final int yearsOfExperience;
    //The container for child objects
    private List<Employee> controls;
    // Constructor


    public CompositeEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
        this.controls = new ArrayList<>();
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDept() + " Experience :" + getYearsOfExperience() + " years");
        for (Employee e : controls) {
            e.printStructures();
        }

    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }

    public void addEmployee(Employee e) {
        controls.add(e);
    }

    public void removeEmployee(Employee e) {
        controls.remove(e);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<Employee> getControls() {
        return controls;
    }
}
