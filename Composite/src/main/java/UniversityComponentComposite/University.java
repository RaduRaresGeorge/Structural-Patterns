package src.main.java.UniversityComponentComposite;

import src.main.java.UniversityComponentComposite.component.UniversityComponent;
import src.main.java.UniversityComponentComposite.composite.College;
import src.main.java.UniversityComponentComposite.composite.Department;
import src.main.java.UniversityComponentComposite.leaf.Professor;

public class University {
    public static void main(String[] args) {
        UniversityComponent mathProfessor = new Professor("Dr. Math");
        UniversityComponent physicsProfessor = new Professor("Dr. Physics");

        Department mathDepartment = new Department("Mathematics");
        mathDepartment.add(mathProfessor);

        Department physicsDepartment = new Department("Physics");
        physicsDepartment.add(physicsProfessor);

        College scienceCollege = new College("Science");
        scienceCollege.add(mathDepartment);
        scienceCollege.add(physicsDepartment);

        scienceCollege.display();
    }
}
