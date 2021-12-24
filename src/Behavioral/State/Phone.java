package Behavioral.State;

public class Phone {
    State state;

    public Phone() {
        state = new Uncharged(this);
    }

    public void changeState(State state) {
        this.state = state;
    }


}
