package Behavioral.Command;

public class Receiver {
    boolean closed = false;
    boolean saved = false;
    boolean printed = false;

    public void printState() {
        System.out.println("Close status: " + closed);
        System.out.println("Saved status: " + saved);
        System.out.println("Printed status: " + printed);
    }
}
