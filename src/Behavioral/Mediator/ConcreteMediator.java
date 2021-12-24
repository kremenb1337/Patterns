package Behavioral.Mediator;

public class ConcreteMediator implements Mediator{
    private Sender buttonSender;
    private Sender clickSender;

    @Override
    public void notifySender(Sender sender) {
        if (sender == buttonSender) {
            buttonReact();
        } else {
            clickReact();
        }
    }
    public void buttonReact() {
        System.out.println("Button has been pushed");
    }

    public void clickReact() {
        System.out.println("Click has been made");
    }

    public void setButtonSender(Sender buttonSender) {
        this.buttonSender = buttonSender;
    }

    public void setClickSender(Sender clickSender) {
        this.clickSender = clickSender;
    }
}
