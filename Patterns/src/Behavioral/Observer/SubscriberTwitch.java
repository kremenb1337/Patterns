package Behavioral.Observer;

public class SubscriberTwitch implements Updating{
    @Override
    public void update() {
        System.out.println("I'm a twitch subscriber");
    }
}
