package Structular.Bridge;

public class modelingCompany extends Company{
    public modelingCompany(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("What's our new modeller doing?");
        developer.doSomething();
    }
}
