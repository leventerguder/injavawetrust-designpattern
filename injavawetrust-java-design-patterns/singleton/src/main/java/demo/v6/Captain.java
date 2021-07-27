package demo.v6;

// Bill Pugh’s Solution
public class Captain {


    private Captain() {
        System.out.println("A captain is elected for your team.");
    }

    // This method does not use a synchronization technique and eager initialization.
    private static class SingletonHelper {
        /* Nested class is referenced after getCaptain() is called */
        private static final Captain captain = new Captain();
    }

    public static Captain getCaptain() {
        return SingletonHelper.captain;
    }
}
