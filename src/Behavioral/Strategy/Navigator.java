package Behavioral.Strategy;

public class Navigator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void navigate() {
        strategy.buildRoute();
    }
}
