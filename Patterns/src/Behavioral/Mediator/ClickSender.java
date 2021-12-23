package Behavioral.Mediator;

public class ClickSender extends Sender{

    public ClickSender(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operation() {
        mediator.notifySender(this);
    }
}
