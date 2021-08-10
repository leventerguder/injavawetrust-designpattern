package demo.v2;

public class PowerCommand implements Command {

    private Receiver receiver;

    public PowerCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeDo() {
        receiver.performDo();
    }

    @Override
    public void executeUnDo() {
        receiver.performUnDo();
    }

}
