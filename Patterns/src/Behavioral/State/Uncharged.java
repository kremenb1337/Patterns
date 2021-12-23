package Behavioral.State;

public class Uncharged extends State{
    public Uncharged(Phone phone) {
        super(phone);
    }

    public void chargeThePhone() {
        phone.changeState(new Blocked(phone));
        System.out.println("Charging the phone");
    }

    @Override
    public void unblock() {
        System.out.println("Phone is uncharged");
    }

    @Override
    public void playTheMusic() {
        System.out.println("Phone is uncharged");
    }

    @Override
    public void block() {
        System.out.println("Phone is uncharged");
    }
}
