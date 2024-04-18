package src.main.java.CalculadoraFacade.calculadora;

import src.main.java.CalculadoraFacade.operaciones.Division;
import src.main.java.CalculadoraFacade.operaciones.Multiplicacion;
import src.main.java.CalculadoraFacade.operaciones.Resta;
import src.main.java.CalculadoraFacade.operaciones.Suma;

/**
 * This class represents a Calculator that performs basic arithmetic operations.
 * It uses the facade design pattern to simplify the interface of the arithmetic operations.
 */
public class Calculadora {

    private final Suma suma;
    private final Resta resta;
    private final Multiplicacion multiplicacion;
    private final Division division;

    /**
     * Constructs a new Calculator with the specified arithmetic operations.
     */
    public Calculadora() {
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
        division = new Division();
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public int sumar(int a, int b) {
        return suma.sumar(a, b);
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of the two integers
     */
    public int restar(int a, int b) {
        return resta.restar(a, b);
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of the two integers
     */
    public int multiplicar(int a, int b) {
        return multiplicacion.multiplicar(a, b);
    }

    /**
     * Divides one integer by another.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the quotient of the two integers
     */
    public int dividir(int a, int b) {
        return division.dividir(a, b);
    }

}