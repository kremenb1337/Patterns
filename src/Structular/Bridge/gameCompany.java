package Structular.Bridge;

public class gameCompany extends Company{

    public gameCompany(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Quick interview with out new developer! ");
        developer.doSomething();
    }
}
