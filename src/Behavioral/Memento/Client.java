package Behavioral.Memento;

public class Client {
    public static void main(String[] args) throws Exception{
        Drawing drawing = new Drawing();
        DrawingStorage storage = new DrawingStorage(drawing);
        storage.containSnapshot();
        drawing = storage.returnSnapshot();
    }
}
