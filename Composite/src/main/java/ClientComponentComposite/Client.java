package src.main.java.ClientComponentComposite;

import src.main.java.ClientComponentComposite.component.Component;
import src.main.java.ClientComponentComposite.component.Composite;
import src.main.java.ClientComponentComposite.component.Leaf;

public class Client {
    public static void main(String[] args) {
        Component allShapes = new Composite("AllShapes");

        Component circle = new Leaf("Circle");
        Component dot = new Leaf("Dot");

        Component compoundShape1 = new Composite("CompoundShape1");
        compoundShape1.add(circle);
        compoundShape1.add(dot);

        Component rectangle = new Leaf("Rectangle");
        Component compoundShape2 = new Composite("CompoundShape2");
        compoundShape2.add(rectangle);
        compoundShape2.add(dot);

        allShapes.add(compoundShape1);
        allShapes.add(compoundShape2);

        allShapes.operation();
    }
}