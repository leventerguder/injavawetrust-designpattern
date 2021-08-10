package demo.v1;

public class CommandPatternExample {

    public static void main(String[] args) {

        System.out.println("***Command Pattern Demo***\n");

        Receiver intendedReceiver = new Receiver();
        MyUndoCommand undoCmd = new MyUndoCommand(intendedReceiver);


        Invoker invoker = new Invoker(undoCmd);
        invoker.invokeCommand();

        MyRedoCommand redoCmd = new MyRedoCommand(intendedReceiver);
        invoker.setCommand(redoCmd);
        invoker.invokeCommand();
    }

}
