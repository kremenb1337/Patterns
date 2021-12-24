package Behavioral.Command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command print = new PrintCommand();
        Caller caller = new Caller(print);

        caller.execute();
    }
}
