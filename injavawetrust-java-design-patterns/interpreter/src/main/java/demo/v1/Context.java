package demo.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Context {

    private int yearofExperience;
    private List<String> permissibleGrades;

    public Context(int experience, String... allowedGrades) {
        this.yearofExperience = experience;
        this.permissibleGrades = new ArrayList<>();
        Collections.addAll(permissibleGrades, allowedGrades);
    }

    public int getYearofExperience() {
        return yearofExperience;
    }

    public List<String> getPermissibleGrades() {
        return permissibleGrades;
    }

}
