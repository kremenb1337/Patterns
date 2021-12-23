package Behavioral.CoR;

public class SMS extends Notifier {

    public SMS(int levelOfExtreme) {
        super(levelOfExtreme);
    }

    @Override
    public void message(String msg) {
        System.out.println("Notification on SMS " + msg);
    }
}
