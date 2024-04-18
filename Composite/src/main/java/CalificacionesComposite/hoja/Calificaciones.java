package src.main.java.CalificacionesComposite.hoja;

import src.main.java.CalificacionesComposite.Matricula;

import java.util.List;

/**
 * This class represents a set of grades in the context of a grading system.
 * It implements the Matricula interface and manages a list of grade values.
 */
public class Calificaciones implements Matricula {
    /**
     * A list of grade values.
     */
    private final List<Double> valores = List.of();
    /**
     * The value of the grade.
     */
    private double valor;
    /**
     * The percentage weight of the grade.
     */
    private double porcentaje;

    /**
     * Constructs a new set of grades with a single grade value and its percentage weight.
     *
     * @param valor the grade value
     * @param porcentaje the percentage weight of the grade
     */
    public Calificaciones(double valor, double porcentaje) {
        this.valor = valor;
        this.porcentaje = porcentaje;
    }

    /**
     * Constructs a new set of grades with a list of grade values and their percentage weight.
     * The grade value is calculated as the average of the grade values in the list.
     *
     * @param valores the list of grade values
     * @param porcentaje the percentage weight of the grades
     */
    public Calificaciones(List<Double> valores, double porcentaje) {
        this.valor = valores.stream().mapToDouble(Double::doubleValue).sum() / valores.size();
        this.porcentaje = porcentaje;
    }

    /**
     * Calculates the weighted grade by multiplying the grade value by its percentage weight.
     *
     * @return the weighted grade
     */
    @Override
    public double calcularNotas() {
        return valor * porcentaje;
    }
}