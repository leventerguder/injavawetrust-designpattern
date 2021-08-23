package demo.v1;

import java.util.Scanner;

public class NeedForNullObjectPattern {

    public static void main(String[] args) {

        System.out.println("***Need for Null Object Pattern Demo***\n");
        String input = null;
        int totalObjects = 0;


        while (true) {
            System.out.println("Enter your choice( Type 'a' for Bus, 'b' for Train ) ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            Vehicle vehicle = null;
            switch (input.toLowerCase()) {
                case "a":
                    vehicle = new Bus();
                    break;
                case "b":
                    vehicle = new Train();
                    break;
            }
            totalObjects = Bus.busCount + Train.trainCount;

            //Immediate Remedy
            if (vehicle != null) {
                vehicle.travel();
            }
            System.out.println("Total number of objects created in the " +
                    "system is :" + totalObjects);
        }

    }
}
