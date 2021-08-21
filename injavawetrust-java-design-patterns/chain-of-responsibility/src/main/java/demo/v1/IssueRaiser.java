package demo.v1;

public class IssueRaiser {

    private Receiver firstReceiver;

    public void setFirstErrorHandler(Receiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message) {
        if (firstReceiver != null) {
            firstReceiver.handleMessage(message);
        }

    }

}
