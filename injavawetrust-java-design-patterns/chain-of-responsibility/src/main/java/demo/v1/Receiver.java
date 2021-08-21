package demo.v1;

public interface Receiver {

    boolean handleMessage(Message message);
    void nextErrorHandler(Receiver nextReceiver);

}
