package decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {

    private final Message msg;

    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        //Be wary of charset!! This is platform dependent..
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }


}
