package demo.v2;

public class UserDefinedCopyConstructorExample {

    public static void main(String[] args) {
        System.out.println("***User defined copy constructor example in Java***\n");
        Student student1 = new Student(1, "John");
        System.out.println(" The details of Student1 is as follows:");
        System.out.println(student1);
        System.out.println("\n Copying student1 to student2 now");

        //Invoking the user-defined copy constructor
        Student student2 = new Student(student1);
        System.out.println(" The details of Student2 is as follows:");
        System.out.println(student2);
    }

}
