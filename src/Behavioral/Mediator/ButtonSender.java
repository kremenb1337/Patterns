package Behavioral.Mediator;

public class ButtonSender extends Sender{

    public ButtonSender(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operation() {
        mediator.notifySender(this);
    }
}
