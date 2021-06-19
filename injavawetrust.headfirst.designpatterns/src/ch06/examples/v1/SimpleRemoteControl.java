package ch06.examples.v1;

public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
