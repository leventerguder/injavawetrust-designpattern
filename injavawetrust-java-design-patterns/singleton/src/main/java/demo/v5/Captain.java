package demo.v5;

// Here is a sample implementation of the eager initialization.
public class Captain {

    // Early initialization

    private static final Captain captain = new Captain();

    // We make the constructor private to prevent the use of "new"

    private Captain() {
        System.out.println("A captain is elected for your team.");
    }

    public static Captain getCaptain() {
        System.out.println("You have a captain for your team.");
        return captain;
    }

    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }
}
