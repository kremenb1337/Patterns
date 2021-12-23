package Behavioral.Command;

public class Caller {
    Executing openCommand;
    Executing printCommand;
    Executing saveCommand;

    public Caller(Executing openCommand, Executing printCommand, Executing saveCommand) {
        this.openCommand = openCommand;
        this.printCommand = printCommand;
        this.saveCommand = saveCommand;
    }

    public void open() {
        openCommand.sendMessage();
    }

    public void print() {
        printCommand.sendMessage();
    }

    public void save() {
        saveCommand.sendMessage();
    }
}
