package src.main.java.CalificacionesComposite.hoja;

import src.main.java.CalificacionesComposite.Matricula;

import java.util.List;

public class Calificaciones implements Matricula {
    private final List<Double> valores = List.of();
    private double valor;
    private double porcentaje;

    public Calificaciones(double valor, double porcentaje) {
        this.valor = valor;
        this.porcentaje = porcentaje;
    }

    public Calificaciones(List<Double> valores, double porcentaje) {
        this.valor = valores.stream().mapToDouble(Double::doubleValue).sum() / valores.size();
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularNotas() {
        return valor * porcentaje;
    }
}