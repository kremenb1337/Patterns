package Behavioral.CoR;

public class Telegram extends Notifier {

    public Telegram(int levelOfExtreme) {
        super(levelOfExtreme);
    }

    @Override
    public void message(String msg) {
        System.out.println("Notification on telegram: " + msg);
    }
}
