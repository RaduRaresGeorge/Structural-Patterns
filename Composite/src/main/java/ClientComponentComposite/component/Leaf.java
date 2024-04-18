package src.main.java.ClientComponentComposite.component;

/**
 * This class represents a leaf in the context of a composite design pattern.
 * It implements the Component interface and performs an operation.
 * The add, remove, and getChild methods are not supported and throw an UnsupportedOperationException.
 */
public class Leaf implements Component {
    /**
     * The name of the leaf.
     */
    private String name;

    /**
     * Constructs a new leaf with a specified name.
     *
     * @param name the name of the leaf
     */
    public Leaf(String name) {
        this.name = name;
    }

    /**
     * Performs an operation on the leaf.
     */
    @Override
    public void operation() {
        System.out.println("Leaf operation performed on " + name);
    }

    /**
     * This operation is not supported for a leaf and throws an UnsupportedOperationException.
     *
     * @param component the component to be added
     * @throws UnsupportedOperationException if this method is invoked
     */
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * This operation is not supported for a leaf and throws an UnsupportedOperationException.
     *
     * @param component the component to be removed
     * @throws UnsupportedOperationException if this method is invoked
     */
    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * This operation is not supported for a leaf and throws an UnsupportedOperationException.
     *
     * @param index the index of the child component
     * @throws UnsupportedOperationException if this method is invoked
     */
    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}