package demo.v2;

public class IndividualEmployee implements Employee {

    private int yearOfExperience;
    private String currentGrade;
    public IndividualEmployee(int experience, String grade){
        this.yearOfExperience=experience;
        this.currentGrade=grade;
    }

    @Override
    public boolean interpret(Context context) {
        if (this.yearOfExperience >= context.getYearofExperience() && context.
                getPermissibleGrades().contains(this.currentGrade)) {
            return true;
        }
        return false;
    }
}
