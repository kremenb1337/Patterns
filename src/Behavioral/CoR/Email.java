package Behavioral.CoR;

public class Email extends Notifier {

    public Email(int levelOfExtreme) {
        super(levelOfExtreme);
    }

    @Override
    public void message(String msg) {
        System.out.println("Notification on email " + msg);
    }
}
