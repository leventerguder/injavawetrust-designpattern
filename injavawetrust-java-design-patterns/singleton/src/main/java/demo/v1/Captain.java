package demo.v1;

final public class Captain {

    private static Captain captain;

    // We make the constructor private to prevent the use of "new"
    private Captain() {

    }


    public static synchronized Captain getCaptain() {

        if (captain == null) {
            captain = new Captain();
            System.out.println("New captain is elected for your team.");
        } else {
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }

        return captain;
    }
}
