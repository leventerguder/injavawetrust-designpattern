package demo.v2;

public class ModifiedIteratorPatternExample {

    public static void main(String[] args) {

        System.out.println("***Modified Iterator Pattern Demo.***");
        Subject subject = new Art();

        ArtIterator iteratorForArts = subject.createIterator();
        System.out.println("\nArts subjects are as follows:");
        while (iteratorForArts.hasNext()) {
            System.out.println(iteratorForArts.next());
        }

        //Moving back to first element
        iteratorForArts.first();
        System.out.println("Currently pointing to: " + iteratorForArts.currentItem());

    }
}
