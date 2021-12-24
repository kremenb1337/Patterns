package Behavioral.Memento;

public class Drawing {
    private int size;
    private int price;
    private String color;
    private boolean selling;

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSelling(boolean selling) {
        this.selling = selling;
    }

    public Drawing makeACopy() {
        return new DrawingBuilder().setColor(color).setSize(size).setPrice(price).setSellingState(selling).getResult();
    }
}
