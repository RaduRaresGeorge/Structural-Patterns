package src.main.java.UniversityComponentComposite.composite;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Department in the context of a composite design pattern.
 * It implements the UniversityComponent interface and provides specific functionality for a Department.
 * A Department can contain other UniversityComponents.
 */
public class Department implements UniversityComponent {
    /**
     * The list of UniversityComponents that this Department contains.
     */
    private List<UniversityComponent> components = new ArrayList<>();

    /**
     * The name of the Department.
     */
    private String name;

    /**
     * Constructs a new Department with the specified name.
     *
     * @param name the name of the Department
     */
    public Department(String name) {
        this.name = name;
    }

    /**
     * Adds a UniversityComponent to this Department.
     *
     * @param component the UniversityComponent to add
     */
    public void add(UniversityComponent component) {
        components.add(component);
    }

    /**
     * Displays this Department and all of its components.
     * It first prints the name of the Department, then calls the display method on each of its components.
     */
    @Override
    public void display() {
        System.out.println("Department: " + name);
        for (UniversityComponent component : components) {
            component.display();
        }
    }
}