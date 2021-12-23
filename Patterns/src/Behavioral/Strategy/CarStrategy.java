package Behavioral.Strategy;

public class CarStrategy implements Strategy{
    @Override
    public void buildRoute() {
        System.out.println("Building a car route");
    }
}
