package demo.v2;

public class Receiver1 implements Receiver {

    private int myNumber;

    public Receiver1() {
        myNumber = 10;
        System.out.println("Receiver1 initialized with " + myNumber);
        System.out.println("The objects of receiver1 cannot set beyond " + myNumber);
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void performDo() {
        System.out.println("Received an addition request.");
        int presentNumber = getMyNumber();
        setMyNumber(presentNumber + 2);
        System.out.println(presentNumber + " + 2 =" + this.myNumber);
    }

    @Override
    public void performUnDo() {

        System.out.println("Received an undo addition request.");
        int presentNumber = this.myNumber;
        //We started with number 10.We'll not decrease further.

        if (presentNumber > 10) {
            setMyNumber(this.myNumber - 2);
            System.out.println(presentNumber + " - 2 =" + this.myNumber);
            System.out.println("\t Undo request processed.");
        } else {
            System.out.println("Nothing more to undo...");
        }
    }
}
