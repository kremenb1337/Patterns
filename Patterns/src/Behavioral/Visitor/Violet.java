package Behavioral.Visitor;

public class Violet implements Flower{
    @Override
    public void reactToBee(Visit visit) {
        visit.visitFlower(this);
    }
}
