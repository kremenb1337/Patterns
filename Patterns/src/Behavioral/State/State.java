package Behavioral.State;

public abstract class State {
    Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract void chargeThePhone();
    public abstract void unblock();
    public abstract void playTheMusic();
    public abstract void block();
}
