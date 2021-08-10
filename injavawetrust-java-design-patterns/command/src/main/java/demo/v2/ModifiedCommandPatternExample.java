package demo.v2;

public class ModifiedCommandPatternExample {

    public static void main(String[] args) {
        System.out.println("***Command Pattern Q&As***");
        System.out.println("***A simple demo with undo supported operations***\n");
        //Client holds both the Invoker and Command Objects

        //Testing receiver -Receiver1
        System.out.println("-----Testing operations in Receiver1-----");
        Receiver receiver = new Receiver1();
        Command currentCmd = new AdditionCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(currentCmd);
        System.out.println("*Testing single do/undo operation*");
        invoker.executeCommand();
        invoker.undoCommand();

        System.out.println("_______");
        System.out.println("**Testing a series of do/undo operations**");
        //Executed the command 2 times
        invoker.executeCommand();
        //invoker.undoCommand();
        invoker.executeCommand();

        invoker.executeCommand();
        //Trying to undo 3 times
        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();

        System.out.println("\n-----Testing operations in Receiver2-----");

        receiver = new Receiver2();
        currentCmd = new PowerCommand(receiver);
        invoker.setCommand(currentCmd);

        System.out.println("*Testing single do/undo operation*");
        invoker.executeCommand();
        invoker.undoCommand();
        System.out.println("_______");
        System.out.println("**Testing a series of do/undo operations**");
        //Executing the command 2 times
        invoker.executeCommand();
        invoker.executeCommand();
        //Trying to undo 3 times
        invoker.undoCommand();
        invoker.undoCommand();
        invoker.undoCommand();
    }

}
