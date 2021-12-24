package Structular.Decorator;

public class TelegramSender extends NotifierDecorator{
    public TelegramSender(MessageSending message) {
        super(message);
    }

    @Override
    public String sendingMessage() {
        return super.sendingMessage() + " telegram";
    }
}
