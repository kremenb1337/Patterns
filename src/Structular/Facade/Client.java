package Structular.Facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println(facade.solveProblem("Heya"));
    }
}
