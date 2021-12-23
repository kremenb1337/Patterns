package Behavioral.Visitor;

public class Dandelion implements Flower{
    @Override
    public void reactToBee(Visit visit) {
        visit.visitFlower(this);
    }
}
