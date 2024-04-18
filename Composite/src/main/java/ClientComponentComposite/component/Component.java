package src.main.java.ClientComponentComposite.component;

/**
 * This interface represents a component in the context of a composite design pattern.
 * It provides methods for performing an operation, adding a component, removing a component, and getting a child component.
 */
public interface Component {

    /**
     * Performs an operation on the component.
     */
    void operation();

    /**
     * Adds a component to the composite.
     *
     * @param component the component to be added
     */
    void add(Component component);

    /**
     * Removes a component from the composite.
     *
     * @param component the component to be removed
     */
    void remove(Component component);

    /**
     * Retrieves a child component from the composite.
     *
     * @param index the index of the child component
     * @return the child component at the specified index
     */
    Component getChild(int index);
}