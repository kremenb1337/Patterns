package Behavioral.State;

public class Blocked extends State{
    public Blocked(Phone phone) {
        super(phone);
    }

    @Override
    public void chargeThePhone() {
        System.out.println("Phone is already charged");
    }

    public void unblock() {
        phone.changeState(new Unblocked(phone));
        System.out.println("Unblocking the phone");
    }

    @Override
    public void playTheMusic() {
        System.out.println("Phone is blocked");
    }

    @Override
    public void block() {
        System.out.println("Phone is already blocked");
    }
}
