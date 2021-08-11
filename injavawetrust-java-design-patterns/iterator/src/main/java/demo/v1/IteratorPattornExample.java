package demo.v1;

public class IteratorPattornExample {

    public static void main(String[] args) {

        System.out.println("***Iterator Pattern Demo***");
        Subject subject = new Art();
        Iterator iterator = subject.createIterator();
        System.out.println("\n Arts subjects are as follows:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Moving back to first element
        iterator.first();
        System.out.println(" Currently pointing back to: "+ iterator.currentItem());

    }

}
