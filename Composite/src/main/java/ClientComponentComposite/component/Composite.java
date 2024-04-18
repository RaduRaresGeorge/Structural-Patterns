package src.main.java.ClientComponentComposite.component;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a composite in the context of a composite design pattern.
 * It implements the Component interface and manages a list of child components.
 */
public class Composite implements Component {
    /**
     * A list of child components.
     */
    private List<Component> children = new ArrayList<>();
    /**
     * The name of the composite.
     */
    private String name;

    /**
     * Constructs a new composite with a specified name.
     *
     * @param name the name of the composite
     */
    public Composite(String name) {
        this.name = name;
    }

    /**
     * Performs an operation on the composite and its child components.
     */
    @Override
    public void operation() {
        System.out.println("Composite operation performed on "  + name);
        for (Component child : children) {
            child.operation();
        }
    }

    /**
     * Adds a child component to the composite.
     *
     * @param component the child component to be added
     */
    @Override
    public void add(Component component) {
        children.add(component);
    }

    /**
     * Removes a child component from the composite.
     *
     * @param component the child component to be removed
     */
    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    /**
     * Retrieves a child component from the composite by its index.
     *
     * @param index the index of the child component
     * @return the child component at the specified index
     */
    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
}
