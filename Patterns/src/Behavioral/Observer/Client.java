package Behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        Informer informer = new Informer();
        Updating subscriberTwitch = new SubscriberTwitch();
        Updating subscriberYoutube = new SubscriberYoutube();

        informer.addNewSubscriber(subscriberTwitch);
        informer.addNewSubscriber(subscriberYoutube);

        informer.notifySubscribers();

        informer.removeSubscriber(subscriberYoutube);

        informer.notifySubscribers();
    }
}
