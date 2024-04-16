package src.main.java.GraphicalShapesComposite;

import src.main.java.GraphicalShapesComposite.shapes.Circle;
import src.main.java.GraphicalShapesComposite.shapes.CompoundShape;
import src.main.java.GraphicalShapesComposite.shapes.Dot;
import src.main.java.GraphicalShapesComposite.shapes.Rectangle;
import src.main.java.GraphicalShapesComposite.editor.ImageEditor;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.BLACK),
                        new Dot(240, 240, Color.BLACK),
                        new Dot(240, 360, Color.BLACK),
                        new Dot(360, 360, Color.BLACK),
                        new Dot(360, 240, Color.BLACK)
                )
        );
    }
}
