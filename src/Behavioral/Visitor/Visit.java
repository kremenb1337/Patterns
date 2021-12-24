package Behavioral.Visitor;

public interface Visit {
    void visitFlower(Daisy daisy);
    void visitFlower(Dandelion dandelion);
    void visitFlower(Violet violet);
}
