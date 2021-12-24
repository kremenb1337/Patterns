package Behavioral.Visitor;

public class Dandelion implements Flower{
    @Override
    public void reactToVisitor(Visit visit) {
        visit.visitFlower(this);
    }
}
