package Structular.Decorator;

public abstract class NotifierDecorator implements MessageSending{

    public MessageSending message;

    public NotifierDecorator(MessageSending message) {
        this.message = message;
    }

    public String sendingMessage() {
        return message.sendingMessage();
    }
}
