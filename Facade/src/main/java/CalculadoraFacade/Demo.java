package src.main.java.CalculadoraFacade;

import src.main.java.CalculadoraFacade.calculadora.Calculadora;

/**
 * This class serves as a demonstration for the Calculator.
 * It creates a Calculator object and performs basic arithmetic operations.
 */
public class Demo {
    /**
     * The main method which serves as the entry point for the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create a new Calculator object
        Calculadora calcular = new Calculadora();

        // Perform and print the result of the addition operation
        System.out.println("Suma: " + calcular.sumar(5, 3));
        // Perform and print the result of the subtraction operation
        System.out.println("Resta: " + calcular.restar(5, 3));
        // Perform and print the result of the multiplication operation
        System.out.println("Multiplicación: " + calcular.multiplicar(5, 3));
        // Perform and print the result of the division operation
        System.out.println("División: " + calcular.dividir(5, 3));
    }
}
