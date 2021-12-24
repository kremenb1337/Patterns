package Behavioral.Command;

public class SaveCommand implements Command{
    Receiver receiver;

    public SaveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void getMessage() {
        System.out.println("Saving file...");
        receiver.saved = true;
    }
}
