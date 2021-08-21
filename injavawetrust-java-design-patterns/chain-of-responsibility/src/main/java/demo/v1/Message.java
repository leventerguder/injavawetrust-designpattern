package demo.v1;

public class Message {

    private String text;
    private MessagePriority priority;

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }
}
