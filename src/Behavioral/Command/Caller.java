package Behavioral.Command;

public class Caller {
    Command command;

    public Caller(Command command) {
        this.command = command;
    }

    public void execute() {
        command.getMessage();
    }
}
