package CalificacionesComposite;

import CalificacionesComposite.compuesto.Asignatura;
import CalificacionesComposite.hoja.Calificaciones;

import java.util.List;

public class Estudiante {

    public static void main(String[] args) {

        Asignatura TecnicasDeProgramacion = new Asignatura();
        Calificaciones ExmParcialTP = new Calificaciones(10, 0.4);
        Calificaciones ProyectoCuatri = new Calificaciones(10, 0.3);
        List<Double> tareasSem = List.of(10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0);
        Calificaciones TareasSem = new Calificaciones(tareasSem, 0.3);

        TecnicasDeProgramacion.addNota(ExmParcialTP);
        TecnicasDeProgramacion.addNota(ProyectoCuatri);
        TecnicasDeProgramacion.addNota(TareasSem);

        System.out.println("La nota final de Tecnicas de programacion es: " + TecnicasDeProgramacion.calcularNotas());

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
