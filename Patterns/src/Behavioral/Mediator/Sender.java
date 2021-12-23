package Behavioral.Mediator;

public abstract class Sender {
    public Mediator mediator;

    public Sender(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void operation();
}
