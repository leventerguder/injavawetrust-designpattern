package demo.v4;

public class Employee implements Cloneable{

    private int id;
    private String name;
    private EmpAddress empAddress;

    public Employee(int id, String name, EmpAddress empAddress) {
        this.id = id;
        this.name = name;
        this.empAddress = empAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpAddress getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(EmpAddress empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", empAddress=" + empAddress +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow Copy
        // return super.clone();

        //For deep copy
        Employee employee = (Employee)  super.clone();
        employee.empAddress = (EmpAddress) empAddress.clone();
        return employee;
    }
}
