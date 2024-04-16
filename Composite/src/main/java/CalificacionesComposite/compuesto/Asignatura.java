package CalificacionesComposite.compuesto;

import CalificacionesComposite.Matricula;

import java.util.ArrayList;
import java.util.List;

public class Asignatura implements Matricula {
    private List<Matricula> notas;

    public Asignatura() {
        this.notas = new ArrayList<>();
    }

    public void addNota(Matricula nota) {
        notas.add(nota);
    }

    public void removeNota(Matricula nota) {
        notas.remove(nota);
    }

    @Override
    public double calcularNotas() {
        return notas.stream().mapToDouble(Matricula::calcularNotas).sum();
    }
}