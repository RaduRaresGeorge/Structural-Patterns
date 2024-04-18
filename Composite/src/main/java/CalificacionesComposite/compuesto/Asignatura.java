package src.main.java.CalificacionesComposite.compuesto;

import src.main.java.CalificacionesComposite.Matricula;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a subject in the context of a grading system.
 * It implements the Matricula interface and manages a list of grades.
 */
public class Asignatura implements Matricula {
    /**
     * A list of grades associated with this subject.
     */
    private List<Matricula> notas;

    /**
     * Constructs a new subject with an empty list of grades.
     */
    public Asignatura() {
        this.notas = new ArrayList<>();
    }

    /**
     * Adds a grade to the list of grades for this subject.
     *
     * @param nota the grade to be added
     */
    public void addNota(Matricula nota) {
        notas.add(nota);
    }

    /**
     * Removes a grade from the list of grades for this subject.
     *
     * @param nota the grade to be removed
     */
    public void removeNota(Matricula nota) {
        notas.remove(nota);
    }

    /**
     * Calculates the sum of all grades for this subject.
     *
     * @return the sum of all grades
     */
    @Override
    public double calcularNotas() {
        return notas.stream().mapToDouble(Matricula::calcularNotas).sum();
    }
}