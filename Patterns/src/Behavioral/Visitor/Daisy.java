package Behavioral.Visitor;

public class Daisy implements Flower{
    @Override
    public void reactToBee(Visit visit) {
        visit.visitFlower(this);
    }
}
