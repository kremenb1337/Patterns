package Behavioral.Visitor;

public class Daisy implements Flower{
    @Override
    public void reactToVisitor(Visit visit) {
        visit.visitFlower(this);
    }
}
