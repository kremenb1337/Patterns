package Behavioral.Strategy;

public class Client {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.setStrategy(new CarStrategy());

        navigator.buildRoute();
    }
}
