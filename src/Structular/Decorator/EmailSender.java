package Structular.Decorator;

public class EmailSender extends NotifierDecorator{

    public EmailSender(MessageSending message) {
        super(message);
    }
    @Override
    public String sendingMessage() {
        return super.sendingMessage() + " email";
    }
}
