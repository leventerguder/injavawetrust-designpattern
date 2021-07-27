package demo.v2;

public class Captain {

    private static Captain captain;

    // We make the constructor private to prevent the use of "new"

    private Captain() {

    }

    /*
    It can work in a single threaded environment only
    but it cannot be considered a thread-safe implementation in a multithreaded environment.
     */
    public static Captain getCaptain() {

        //Lazy initialization
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
