package Creational.AbstractFactory;

public class MathStore implements SchoolStore {
    public Book sellBook() {
        return new MathClassBook();
    }

    public Notebook sellNotebook() {
        return new MathClassNotebook();
    }
}
