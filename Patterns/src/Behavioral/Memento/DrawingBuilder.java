package Behavioral.Memento;

public class DrawingBuilder {
    Drawing drawing = new Drawing();

    public DrawingBuilder setSize(int size) {
        drawing.setSize(size);
        return this;
    }
    public DrawingBuilder setPrice(int price) {
        drawing.setPrice(price);
        return this;
    }
    public DrawingBuilder setColor(String color) {
        drawing.setColor(color);
        return this;
    }
    public DrawingBuilder setSellingState(boolean selling) {
        drawing.setSelling(selling);
        return this;
    }
    public Drawing getResult() {
        return drawing;
    }
}
