package CalculadoraFacade.calculadora;

import CalculadoraFacade.operaciones.Division;
import CalculadoraFacade.operaciones.Multiplicacion;
import CalculadoraFacade.operaciones.Resta;
import CalculadoraFacade.operaciones.Suma;

public class Calculadora {

    private final Suma suma;
    private final Resta resta;
    private final Multiplicacion multiplicacion;
    private final Division division;

    public Calculadora() {
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
        division = new Division();
    }

    public int sumar(int a, int b) {
        return suma.sumar(a, b);
    }

    public int restar(int a, int b) {
        return resta.restar(a, b);
    }

    public int multiplicar(int a, int b) {
        return multiplicacion.multiplicar(a, b);
    }

    public int dividir(int a, int b) {
        return division.dividir(a, b);
    }

}
