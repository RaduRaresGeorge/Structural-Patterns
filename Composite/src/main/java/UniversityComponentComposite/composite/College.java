package src.main.java.UniversityComponentComposite.composite;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;

import java.util.ArrayList;
import java.util.List;

public class College implements UniversityComponent {
    private List<UniversityComponent> components = new ArrayList<>();
    private String name;

    public College(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("College: " + name);
        for (UniversityComponent component : components) {
            component.display();
        }
    }
}
