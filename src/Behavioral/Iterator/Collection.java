package Behavioral.Iterator;

public class Collection implements Cltn{
    public String[] strings;

    public Collection(String[] strings) {
        this.strings = strings;
    }
    public String[] getStrings() {
        return strings;
    }

    @Override
    public Iterator getIterator() {
        Collection collection = new Collection(strings);
        return new LeftToRightIterator(collection);
    }
}
