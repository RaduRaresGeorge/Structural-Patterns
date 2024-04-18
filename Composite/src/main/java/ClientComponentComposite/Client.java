package src.main.java.ClientComponentComposite;

import src.main.java.ClientComponentComposite.component.Component;
import src.main.java.ClientComponentComposite.component.Composite;
import src.main.java.ClientComponentComposite.component.Leaf;

/**
 * This class represents a client that uses the composite design pattern.
 * It creates a composite of shapes, adds shapes to the composite, and performs an operation on the composite.
 */
public class Client {

    /**
     * The main method of this class.
     * It creates a composite of shapes, adds shapes to the composite, and performs an operation on the composite.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // Create a composite to hold all shapes
        Component allShapes = new Composite("AllShapes");

        // Create individual shapes
        Component circle = new Leaf("Circle");
        Component dot = new Leaf("Dot");

        // Create a compound shape and add individual shapes to it
        Component compoundShape1 = new Composite("CompoundShape1");
        compoundShape1.add(circle);
        compoundShape1.add(dot);

        // Create another compound shape and add individual shapes to it
        Component rectangle = new Leaf("Rectangle");
        Component compoundShape2 = new Composite("CompoundShape2");
        compoundShape2.add(rectangle);
        compoundShape2.add(dot);

        // Add the compound shapes to the composite that holds all shapes
        allShapes.add(compoundShape1);
        allShapes.add(compoundShape2);

        // Perform an operation on the composite that holds all shapes
        allShapes.operation();
    }
}