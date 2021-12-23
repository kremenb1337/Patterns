package Structular.Lightweight;

import java.util.HashMap;
import java.util.Map;

public class FiguresFactory {
    Map<String, Drawing> figures = new HashMap<>();

    public Drawing newFigure(String s) {
        Drawing drawing;
        if (figures.get(s) == null) {
            switch (s) {
                case "square":
                    System.out.println("Drawing a new square!");
                    drawing = new Square();
                    figures.put(s, drawing);
                    return drawing;
                case "circle":
                    System.out.println("Drawing a new circle!");
                    drawing = new Circle();
                    figures.put(s, drawing);
                    return drawing;
                case "triangle":
                    System.out.println("Drawing a new triangle!");
                    drawing = new Triangle();
                    figures.put(s, drawing);
                    return drawing;
                default:
                    System.out.println("We can't make you this figure");
                    return null;
            }
        }
        return figures.get(s);
    }
}
