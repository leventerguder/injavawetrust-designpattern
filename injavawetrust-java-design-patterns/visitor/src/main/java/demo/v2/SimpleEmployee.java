package demo.v2;

public class SimpleEmployee implements Employee {

    private String name;
    private String dept;
    //New field for this example
    private int yearsOfExperience;

    public SimpleEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
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

    @Override
    public void printStructures() {
        System.out.println("\t\t" + getName() + " works in " + getDept() +
                " Experience :" + getYearsOfExperience() + " years");
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }

}
