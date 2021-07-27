package demo.v7;

public final class Captain {

    private static Captain captain;

    // We make the constructor private to prevent the use of "new"
    static int numberOfInstance = 0;

    private Captain() {
        numberOfInstance++;
        System.out.println("Number of instances at this moment=" + numberOfInstance);

    }

    public static Captain getCaptain() {

        if (captain == null) {

            synchronized (Captain.class) {
                captain = new Captain();
                System.out.println("New captain is elected for your team.");
            }
        }else {
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }

        return captain;
    }

}
