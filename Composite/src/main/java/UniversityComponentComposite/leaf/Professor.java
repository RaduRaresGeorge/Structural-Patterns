package src.main.java.UniversityComponentComposite.leaf;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;

public class Professor implements UniversityComponent {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Professor: " + name);
    }
}
