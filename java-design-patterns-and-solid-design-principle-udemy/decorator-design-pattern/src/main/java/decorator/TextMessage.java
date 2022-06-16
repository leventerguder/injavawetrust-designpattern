package decorator;

//Concrete component. Object to be decorated
public class TextMessage implements Message {

    private final String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }
}
