package Behavioral.Visitor;

public class Client {
    public static void main(String[] args) {
        Bee bee = new Bee();
        Flower daisy = new Daisy();
        Flower violet = new Violet();
        Flower dandelion = new Dandelion();
        daisy.reactToVisitor(bee);
        System.out.println("-----------------------");
        violet.reactToVisitor(bee);
        System.out.println("-----------------------");
        dandelion.reactToVisitor(bee);
    }
}
