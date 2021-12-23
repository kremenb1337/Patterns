package Behavioral.Command;

public class OpenCommand extends Executing{

    public OpenCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public String getMessage() {
        return "Open the file";
    }
}
