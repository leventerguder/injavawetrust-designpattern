package demo.v2;

public class Electronics extends BasicEngineering {

    @Override
    public void completeSpecialPaper() {
        System.out.println("3.Digital Logic and Circuit Theory");
    }


    //Overriding the hook method:
    //Indicating that AdditionalPapers are not needed for Electronics. @Override
    public boolean isAdditionalPapersNeeded() {
        return false;
    }
}
