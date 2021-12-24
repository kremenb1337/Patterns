package Behavioral.State;

public class Unblocked extends State{
    public Unblocked(Phone phone) {
        super(phone);
    }

    @Override
    public void chargeThePhone() {
        System.out.println("Phone is already charged");
    }

    @Override
    public void unblock() {
        System.out.println("Phone is already unblocked");
    }

    public void playTheMusic() {
        System.out.println("Playing the music");
    }

    @Override
    public void block() {
        phone.changeState(new Blocked(phone));
        System.out.println("Blocking the phone");
    }
}
