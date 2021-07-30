package demo.v3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Proxy extends Subject {

    private static Subject cs;
    private String currentUser;
    private List<String> registeredUsers = new ArrayList<String>(Arrays.asList(
            "Admin", "Rohit", "Sam"));

    public Proxy(String currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public void doSomeWork() {
        System.out.println("\n Proxy call happening now...");
        System.out.println(currentUser + " wants to invoke a proxy method.");

        if (registeredUsers.contains(currentUser)) {
            if (cs == null) {
                cs = new ConcreteSubject();
            }
            //Allow the registered user to invoke the method
            cs.doSomeWork();
        } else {
            System.out.println("Sorry " + currentUser + " you do not have access rights.");
        }


    }
}
