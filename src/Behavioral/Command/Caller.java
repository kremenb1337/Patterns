package Behavioral.Command;

public class Caller {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.getMessage();
    }
}
