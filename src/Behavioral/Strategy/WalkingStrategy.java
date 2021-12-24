package Behavioral.Strategy;

public class WalkingStrategy implements Strategy{
    @Override
    public void buildRoute() {
        System.out.println("Building a walking route");
    }
}
