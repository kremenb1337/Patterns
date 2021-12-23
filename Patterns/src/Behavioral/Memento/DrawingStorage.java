package Behavioral.Memento;

import java.util.Stack;

public class DrawingStorage {
    private Drawing drawing;
    private Stack<Drawing> drawingSnapshots = new Stack<>();

    public DrawingStorage(Drawing drawing) {
        this.drawing = drawing;
    }

    public void containSnapshot() {
        drawingSnapshots.push(drawing.makeACopy());
    }

    public Drawing returnSnapshot() throws Exception {
        if (drawingSnapshots.peek() != null) {
            return drawingSnapshots.pop();
        } else {
            throw new Exception("No drawing");
        }
    }
}
