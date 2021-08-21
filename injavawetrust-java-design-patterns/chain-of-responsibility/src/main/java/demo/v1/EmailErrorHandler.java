package demo.v1;

public class EmailErrorHandler implements Receiver {

    private Receiver nextReceiver;

    @Override
    public boolean handleMessage(Message message) {

        if (message.getText().contains("Email")) {
            System.out.println(" EmailErrorHandler processed " + message.getPriority()
                    + " priority issue: " + message.getText());
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
