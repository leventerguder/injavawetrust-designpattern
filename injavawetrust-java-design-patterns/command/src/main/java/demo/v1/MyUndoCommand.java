package demo.v1;

public class MyUndoCommand implements Command{

    private Receiver receiver;

    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        //Perform any optional task prior to UnDo
        receiver.doOptionalTaskPriorToUndo();
        //Call UnDo in receiver now
        receiver.performUndo();
    }
}
