package Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        Collection collection = new Collection(new String[]{"Hello,", "my name is", "Illya"});
        Iterator iterator = collection.getIterator();
        iterator.displayCollection();
    }
}
