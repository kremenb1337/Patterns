package Structular.Decorator;

public class Client {
    public static void main(String[] args) {
        MessageSending message = new EmailSender(new TelegramSender(new FacebookSender(new Notifier())));
        System.out.println(message.sendingMessage());
    }
}
