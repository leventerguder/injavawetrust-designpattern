package demo.v3;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeIterator implements Iterator<Employee> {

    private LinkedList<Employee> employeeList;
    private int position;

    public EmployeeIterator(LinkedList<Employee> employeeList) {
        this.employeeList = employeeList;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public Employee currentItem() {
        return employeeList.get(position);
    }

    @Override
    public boolean hasNext() {
        if(position >= employeeList.size())
            return false;
        return true;
    }

    @Override
    public Employee next() {
        return employeeList.get(position++);
    }
}
