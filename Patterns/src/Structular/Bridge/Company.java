package Structular.Bridge;

public abstract class Company {
    Developer developer;

    public Company(Developer developer) {
        this.developer = developer;
    }
    public abstract void develop();
}
