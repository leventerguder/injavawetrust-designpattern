package demo.v3;

public class Captain {

    private static Captain captain;

    static int numberOfInstance = 0;

    // We make the constructor private to prevent the use of "new"
    private Captain() {
        numberOfInstance++;
        System.out.println("Number of instances at this moment=" +
                numberOfInstance);
    }

    public static synchronized Captain getCaptain() {

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

    public class CaptainDerived extends  Captain {

    }

}
