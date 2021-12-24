package Behavioral.Visitor;

public class Violet implements Flower{
    @Override
    public void reactToVisitor(Visit visit) {
        visit.visitFlower(this);
    }
}
