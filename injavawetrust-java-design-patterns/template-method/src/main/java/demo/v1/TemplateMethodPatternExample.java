package demo.v1;

public class TemplateMethodPatternExample {

    public static void main(String[] args) {

        System.out.println("***Template Method Pattern Demo***\n");
        BasicEngineering preferrredCourse = new ComputerScience();
        System.out.println("Computer Sc. course will be completed in following order:");
        preferrredCourse.completeCourse();
        System.out.println();
        preferrredCourse = new Electronics();
        System.out.println("Electronics course will be completed in following order:");
        preferrredCourse.completeCourse();

    }

}
