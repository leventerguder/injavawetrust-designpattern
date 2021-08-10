package demo.v1;

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invokeCommand() {
        command.executeCommand();
    }
}
