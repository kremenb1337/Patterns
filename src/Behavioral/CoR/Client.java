package Behavioral.CoR;

public class Client {
    public static void main(String[] args) {
        Notifier SMSNotifier = new SMS(3);
        Notifier telegramNotifier = new Telegram(2);
        Notifier emailNotifier = new Email(1);

        emailNotifier.setChainedNotifier(telegramNotifier);
        telegramNotifier.setChainedNotifier(SMSNotifier);

        emailNotifier.notifyUser("Dude it's killing here", 3);
    }
}
