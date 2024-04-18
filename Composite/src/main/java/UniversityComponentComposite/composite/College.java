package src.main.java.UniversityComponentComposite.composite;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a College in the context of a composite design pattern.
 * It implements the UniversityComponent interface and provides specific functionality for a College.
 * A College can contain other UniversityComponents.
 */
public class College implements UniversityComponent {
    /**
     * The list of UniversityComponents that this College contains.
     */
    private List<UniversityComponent> components = new ArrayList<>();

    /**
     * The name of the College.
     */
    private String name;

    /**
     * Constructs a new College with the specified name.
     *
     * @param name the name of the College
     */
    public College(String name) {
        this.name = name;
    }

    /**
     * Adds a UniversityComponent to this College.
     *
     * @param component the UniversityComponent to add
     */
    public void add(UniversityComponent component) {
        components.add(component);
    }

    /**
     * Displays this College and all of its components.
     * It first prints the name of the College, then calls the display method on each of its components.
     */
    @Override
    public void display() {
        System.out.println("College: " + name);
        for (UniversityComponent component : components) {
            component.display();
        }
    }
}