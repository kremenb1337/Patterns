package Behavioral.CoR;

public abstract class Notifier{
    private int levelOfExtreme;
    private Notifier chainedNotifier;

    public Notifier(int levelOfExtreme) {
        this.levelOfExtreme = levelOfExtreme;
    }

    public void setChainedNotifier(Notifier chainedNotifier) {
        this.chainedNotifier = chainedNotifier;
    }

    public void notifyUser(String msg, int situation) {
        if (situation >= levelOfExtreme) {
            message(msg);
        }
        if (chainedNotifier != null) {
            chainedNotifier.notifyUser(msg, situation);
        }
    }

    public abstract void message(String msg);
}
