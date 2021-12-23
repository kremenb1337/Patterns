package Behavioral.Mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Sender button = new ButtonSender(mediator);
        Sender click = new ClickSender(mediator);

        mediator.setButtonSender(button);
        mediator.setClickSender(click);

        button.operation();
        click.operation();
    }
}
