package Behavioral.Command;

public class PrintCommand implements Command{
    Receiver receiver;

    public PrintCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void getMessage() {
        System.out.println("Printing file...");
        receiver.printed = true;
    }
}
