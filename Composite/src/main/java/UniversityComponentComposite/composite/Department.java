package src.main.java.UniversityComponentComposite.composite;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;

import java.util.ArrayList;
import java.util.List;

public class Department implements UniversityComponent {
    private List<UniversityComponent> components = new ArrayList<>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Department: " + name);
        for (UniversityComponent component : components) {
            component.display();
        }
    }
}
