package Structular.Decorator;

public class Notifier implements MessageSending{

    @Override
    public String sendingMessage() {
        return "Sending message to:";
    }
}
