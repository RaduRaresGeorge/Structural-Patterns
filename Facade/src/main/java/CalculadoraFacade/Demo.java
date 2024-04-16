package CalculadoraFacade;


import CalculadoraFacade.calculadora.Calculadora;

public class Demo {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        System.out.println("Suma: " + calcular.sumar(5, 3));
        System.out.println("Resta: " + calcular.restar(5, 3));
        System.out.println("Multiplicación: " + calcular.multiplicar(5, 3));
        System.out.println("División: " + calcular.dividir(5, 3));

    }

}
