package src.main.java.UniversityComponentComposite.leaf;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;

/**
 * This class represents a Professor in the context of a composite design pattern.
 * It implements the UniversityComponent interface and provides specific functionality for a Professor.
 */
public class Professor implements UniversityComponent {
    /**
     * The name of the Professor.
     */
    private String name;

    /**
     * Constructs a new Professor with the specified name.
     *
     * @param name the name of the Professor
     */
    public Professor(String name) {
        this.name = name;
    }

    /**
     * Displays this Professor.
     * It prints the name of the Professor.
     */
    @Override
    public void display() {
        System.out.println("Professor: " + name);
    }
}