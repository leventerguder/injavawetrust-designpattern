package demo.v2;

public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.executeDo();
    }

    public void undoCommand(){
        command.executeUnDo();
    }
}
