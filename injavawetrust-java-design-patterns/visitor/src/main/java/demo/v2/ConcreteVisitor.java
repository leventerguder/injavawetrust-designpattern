package demo.v2;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitTheElement(CompositeEmployee employee) {

        //We'll promote them if experience is greater than 15 years
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 15 ? true : false;
        System.out.println("\t\t" + employee.getName() + " from " +
                employee.getDept() + " is eligible for promotion? " +
                eligibleForPromotion);
    }

    @Override
    public void visitTheElement(SimpleEmployee employee) {

        //We'll promote them if experience is greater than 12 years
        boolean eligibleForPromotion = employee.getYearsOfExperience() > 12 ? true : false;
        System.out.println("\t\t" + employee.getName() + " from " +
                employee.getDept() + " is eligible for promotion? " +
                eligibleForPromotion);
    }
}
