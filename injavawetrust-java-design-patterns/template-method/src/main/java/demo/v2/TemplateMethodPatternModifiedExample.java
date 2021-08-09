package demo.v2;

public class TemplateMethodPatternModifiedExample {

    public static void main(String[] args) {

        System.out.println("***Template Method Pattern Modified Demo***\n");
        BasicEngineering preferrredCourse = new ComputerScience();
        System.out.println("Computer Sc. course will be completed in following order:");
        preferrredCourse.completeCourse();
        System.out.println();
        preferrredCourse = new Electronics();
        System.out.println("Electronics course will be completed in following order:");
        preferrredCourse.completeCourse();

    }

}
