package UniversityComponentComposite;

import UniversityComponentComposite.component.UniversityComponent;
import UniversityComponentComposite.composite.College;
import UniversityComponentComposite.composite.Department;
import UniversityComponentComposite.leaf.Professor;

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
