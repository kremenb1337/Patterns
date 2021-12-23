package Behavioral.Command;

public class PrintCommand extends Executing{
    public PrintCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public String getMessage() {
        return "Print the file";
    }
}
