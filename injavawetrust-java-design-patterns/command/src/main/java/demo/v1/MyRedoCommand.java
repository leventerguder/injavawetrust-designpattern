package demo.v1;

public class MyRedoCommand implements Command{

    private Receiver receiver;

    public MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        //Perform any optional task prior to ReDo
        receiver.doOptionalTaskPriorToRedo();
        //Call ReDo in receiver now
        receiver.performRedo();
    }
}
