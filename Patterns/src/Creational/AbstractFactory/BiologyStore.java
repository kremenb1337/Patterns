package Creational.AbstractFactory;

public class BiologyStore implements SchoolStore {
    public Book sellBook() {
        return new BiologyClassBook();
    }

    public Notebook sellNotebook() {
        return new BiologyClassNoteBook();
    }
}
