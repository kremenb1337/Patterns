package Behavioral.State;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.state.playTheMusic();
        phone.state.chargeThePhone();
        phone.state.playTheMusic();
    }
}
