package Behavioral.Visitor;

public class Bee implements Visit{
    @Override
    public void visitFlower(Daisy daisy) {
        System.out.println("Bee has landed on daisy");
    }

    @Override
    public void visitFlower(Dandelion dandelion) {
        System.out.println("Bee has landed on dandelion");
    }

    @Override
    public void visitFlower(Violet violet) {
        System.out.println("Bee has landed on violet");
    }
}
