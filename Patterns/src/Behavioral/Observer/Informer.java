package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Informer {
    private List<Updating> subscribers = new ArrayList<>();

    public void addNewSubscriber(Updating updating) {
        subscribers.add(updating);
    }
    public void removeSubscriber(Updating updating) {
        subscribers.remove(updating);
    }
    public void notifySubscribers() {
        for (Updating subscriber : subscribers) {
            subscriber.update();
        }
    }
}
