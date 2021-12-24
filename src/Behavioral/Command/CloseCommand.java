package Behavioral.Command;

public class CloseCommand implements Command {
    Receiver receiver;

    public CloseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void getMessage() {
        System.out.println("Closing app...");
        receiver.closed = true;
    }
}
