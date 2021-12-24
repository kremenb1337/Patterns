package Behavioral.Command;

public class PrintCommand implements Command{
    Receiver receiver;
    @Override
    public void getMessage() {
        System.out.println("Printing file...");
        receiver.printed = true;
    }
}
