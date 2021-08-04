package demo.v1;

import java.util.List;
import java.util.ArrayList;

public class CompositeEmployee implements IEmployee {

    private int employeeCount = 0;
    private String name;
    private String dept;
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        controls = new ArrayList<IEmployee>();
    }

    public void addEmployee(IEmployee e) {
        controls.add(e);
    }

    public void removeEmployee(IEmployee e) {
        controls.remove(e);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in " + this.dept);
        for (IEmployee e : controls) {
            e.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
        employeeCount = controls.size();
        for (IEmployee e : controls) {
            employeeCount += e.getEmployeeCount();
        }
        return employeeCount;
    }
}
