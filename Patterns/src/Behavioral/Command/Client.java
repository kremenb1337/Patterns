package Behavioral.Command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Executing openCommand = new OpenCommand(receiver);
        Executing printCommand = new PrintCommand(receiver);
        Executing saveCommand = new SaveCommand(receiver);

        Caller caller = new Caller(openCommand, printCommand, saveCommand);

        caller.open();
        caller.save();
        caller.print();
    }
}
