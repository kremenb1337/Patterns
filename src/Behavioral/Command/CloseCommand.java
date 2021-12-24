package Behavioral.Command;

public class CloseCommand implements Command {
    Receiver receiver;
    @Override
    public void getMessage() {
        System.out.println("Closing app...");
        receiver.closed = true;
    }
}
