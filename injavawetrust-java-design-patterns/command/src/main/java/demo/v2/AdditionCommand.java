package demo.v2;

public class AdditionCommand implements Command{

    private Receiver receiver;

    public AdditionCommand(Receiver receiver) {
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
