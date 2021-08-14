package demo.v4;

public class ShallowVsDeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("***Shallow vs Deep Copy Demo***\n");
        EmpAddress initialAddress = new EmpAddress("21, abc Road, USA");
        Employee emp = new Employee(1, "John", initialAddress);
        System.out.println("emp1 object is as follows:");
        System.out.println(emp);
        Employee empClone = (Employee) emp.clone();
        System.out.println("empClone object is as follows:");
        System.out.println(empClone);
        System.out.println("\n Now changing the name, id and address of the emp object ");
        emp.setId(10);
        emp.setName("Sam");
        emp.getEmpAddress().setAddress("221, xyz Road, Canada");
        System.out.println("Now emp1 object is as follows:");
        System.out.println(emp);
        System.out.println("And emp1Clone object is as follows:");
        System.out.println(empClone);
    }
}
