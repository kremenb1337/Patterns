package Behavioral.Strategy;

public class BicycleStrategy implements Strategy{
    @Override
    public void buildRoute() {
        System.out.println("Building a bicycle route");
    }
}
