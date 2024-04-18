package src.main.java.UniversityComponentComposite;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;
import src.main.java.UniversityComponentComposite.composite.College;
import src.main.java.UniversityComponentComposite.composite.Department;
import src.main.java.UniversityComponentComposite.leaf.Professor;

/**
 * This class represents a University in the context of a composite design pattern.
 * It creates a hierarchy of UniversityComponents (Professors, Departments, and Colleges) and displays them.
 */
public class University {
    /**
     * The main method that serves as the entry point for the application.
     * It creates a hierarchy of UniversityComponents and displays them.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create Professors
        UniversityComponent mathProfessor = new Professor("Dr. Math");
        UniversityComponent physicsProfessor = new Professor("Dr. Physics");

        // Create Departments and add Professors to them
        Department mathDepartment = new Department("Mathematics");
        mathDepartment.add(mathProfessor);

        Department physicsDepartment = new Department("Physics");
        physicsDepartment.add(physicsProfessor);

        // Create a College and add Departments to it
        College scienceCollege = new College("Science");
        scienceCollege.add(mathDepartment);
        scienceCollege.add(physicsDepartment);

        // Display the College and all its components
        scienceCollege.display();
    }
}