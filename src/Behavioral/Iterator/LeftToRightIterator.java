package Behavioral.Iterator;

public class LeftToRightIterator implements Iterator{
    Collection collection;
    private int currentIteration = 0;

    public LeftToRightIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return collection.getStrings().length > currentIteration;
    }

    @Override
    public Object next() {
        Object next = collection.getStrings()[currentIteration];
        currentIteration++;
        return next;
    }

    public void displayCollection() {
        while (hasNext()) {
            System.out.print(next() + " ");
        }
    }

}
