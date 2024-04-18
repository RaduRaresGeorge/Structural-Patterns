package src.main.java.GraphicalShapesComposite;

import src.main.java.GraphicalShapesComposite.shapes.Circle;
import src.main.java.GraphicalShapesComposite.shapes.CompoundShape;
import src.main.java.GraphicalShapesComposite.shapes.Dot;
import src.main.java.GraphicalShapesComposite.shapes.Rectangle;
import src.main.java.GraphicalShapesComposite.editor.ImageEditor;

import java.awt.*;

/**
 * This class serves as the entry point for the application.
 * It creates an instance of the ImageEditor and loads shapes into it.
 */
public class Demo {
    /**
     * The main method of the application.
     * It creates an instance of the ImageEditor and loads shapes into it.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the ImageEditor
        ImageEditor editor = new ImageEditor();

        // Load shapes into the ImageEditor
        editor.loadShapes(
                // Create a blue circle at (10, 10) with a radius of 10
                new Circle(10, 10, 10, Color.BLUE),

                // Create a compound shape consisting of a red circle at (110, 110) with a radius of 50
                // and a red dot at (160, 160)
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                // Create a compound shape consisting of a black rectangle at (250, 250) with a width and height of 100
                // and four black dots at the corners of the rectangle
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
