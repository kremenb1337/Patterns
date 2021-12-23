package Structular.Composite;

public class Team implements Developer{
    Developer developer1;
    Developer developer2;
    Developer developer3;

    public Team(Developer developer1, Developer developer2, Developer developer3) {
        this.developer1 = developer1;
        this.developer2 = developer2;
        this.developer3 = developer3;
    }

    @Override
    public void writeCode() {
        System.out.println("Team writes crazy project");
        developer1.writeCode();
        developer2.writeCode();
        developer3.writeCode();
    }
}
