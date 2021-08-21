package demo.v1;

public class FaxErrorHandler implements Receiver {

    private Receiver nextReceiver;

    @Override
    public boolean handleMessage(Message message) {
        if (message.getText().contains("Fax")) {
            System.out.println(" FaxErrorHandler processed " + message.getPriority()
                    + " priority issue :" + message.getText());
            return true;
        } else {
            if (nextReceiver != null)
                nextReceiver.handleMessage(message);
        }
        return false;
    }

    @Override
    public void nextErrorHandler(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }
}
