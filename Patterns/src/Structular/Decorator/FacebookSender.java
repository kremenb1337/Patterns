package Structular.Decorator;

public class FacebookSender extends NotifierDecorator{
    public FacebookSender(MessageSending message) {
        super(message);
    }

    @Override
    public String sendingMessage() {
        return super.sendingMessage() + " facebook";
    }
}
