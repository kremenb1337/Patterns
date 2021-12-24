package Behavioral.Command;

public class SaveCommand implements Command{
    Receiver receiver;
    @Override
    public void getMessage() {
        System.out.println("Saving file...");
        receiver.saved = true;
    }
}
