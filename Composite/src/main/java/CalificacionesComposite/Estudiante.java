package src.main.java.CalificacionesComposite;

import src.main.java.CalificacionesComposite.compuesto.Asignatura;
import src.main.java.CalificacionesComposite.hoja.Calificaciones;

import java.util.List;

/**
 * This class represents a student in the context of a grading system.
 * It calculates and prints the final grades for several subjects.
 */
public class Estudiante {

    /**
     * The main method of this class.
     * It creates several subjects and grades, calculates the final grades for these subjects, and prints them.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // Create a subject and its grades
        Asignatura TecnicasDeProgramacion = new Asignatura();
        Calificaciones ExmParcialTP = new Calificaciones(10, 0.4);
        Calificaciones ProyectoCuatri = new Calificaciones(10, 0.3);
        List<Double> tareasSem = List.of(10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0);
        Calificaciones TareasSem = new Calificaciones(tareasSem, 0.3);

        // Add the grades to the subject
        TecnicasDeProgramacion.addNota(ExmParcialTP);
        TecnicasDeProgramacion.addNota(ProyectoCuatri);
        TecnicasDeProgramacion.addNota(TareasSem);

        // Print the final grade for the subject
        System.out.println("La nota final de Tecnicas de programacion es: " + TecnicasDeProgramacion.calcularNotas());

        // Repeat the process for other subjects
        Asignatura BasesDeDatos = new Asignatura();
        Calificaciones TrabajoFinalBD = new Calificaciones(10, 0.5);
        Calificaciones ExmFinalBD = new Calificaciones(10, 0.5);

        BasesDeDatos.addNota(TrabajoFinalBD);
        BasesDeDatos.addNota(ExmFinalBD);

        System.out.println("La nota final de Base de datos es: " + BasesDeDatos.calcularNotas());

        Asignatura SistemasOperativos = new Asignatura();
        List<Double> labSSOO = List.of(8.0, 9.0, 6.0, 7.0);
        Calificaciones LabSSOO = new Calificaciones(labSSOO, 0.4);
        Calificaciones ExmFinalSSOO = new Calificaciones(10, 0.6);

        SistemasOperativos.addNota(LabSSOO);
        SistemasOperativos.addNota(ExmFinalSSOO);

        System.out.println("La nota final de Sistemas Operativos es: " + SistemasOperativos.calcularNotas());

    }
}