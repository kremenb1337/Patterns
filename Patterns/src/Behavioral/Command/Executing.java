package Behavioral.Command;

public abstract class Executing {
    public Receiver receiver;

    public Executing(Receiver receiver) {
        this.receiver = receiver;
    }

    public void sendMessage() {
        receiver.executeMessage(getMessage());
    }

    public abstract String getMessage();

}
