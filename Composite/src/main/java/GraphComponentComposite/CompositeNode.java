package src.main.java.GraphComponentComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a composite node in the context of a composite design pattern.
 * It implements the GraphComponent interface and manages a list of child components.
 */
public class CompositeNode implements GraphComponent {
    /**
     * A list of child components.
     */
    private List<GraphComponent> children = new ArrayList<>();
    /**
     * The id of the composite node.
     */
    private String id;

    /**
     * Constructs a new composite node with a specified id.
     *
     * @param id the id of the composite node
     */
    public CompositeNode(String id) {
        this.id = id;
    }

    /**
     * Adds a child component to the composite node.
     *
     * @param component the child component to be added
     */
    public void add(GraphComponent component) {
        children.add(component);
    }

    /**
     * Displays the composite node and its child components.
     * It first prints the id of the composite node, then for each child component,
     * it prints the id of the child node and the id of the composite node to which it is connected,
     * and finally calls the display method of the child component.
     */
    @Override
    public void display() {
        System.out.println("Composite Node: " + id);
        for (GraphComponent child : children) {
            System.out.println("Node " + ((Node)child).getId() + " is connected to Composite Node: " + id);
            child.display();
        }
    }
}