package Creational.AbstractFactory;

public class PhysicsStore implements SchoolStore {
    public Book sellBook() {
        return new PhysicsLessonBook();
    }

    public Notebook sellNotebook() {
        return new PhysicsLessonNotebook();
    }
}
