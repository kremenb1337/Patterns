package Behavioral.Command;

public class SaveCommand extends Executing{

    public SaveCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public String getMessage() {
        return "Save the file";
    }
}
