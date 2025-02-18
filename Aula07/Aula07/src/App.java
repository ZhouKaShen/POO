import classes.Circulo;
import classes.Quadrado;

import classes.CalculadorArea;

public class App {
    public static void main(String[] args) {
        // Encapsulamento -> Interface
        /* Circulo circuloPequeno = new Circulo(2);
        System.out.println(circuloPequeno.calcularArea());

        circuloPequeno.setRaio(3);
        System.out.println(circuloPequeno.calcularArea());

        System.out.println();

        Quadrado quadrado2 = new Quadrado(3);
        System.out.println(quadrado2.calcularArea());

        quadrado2.setLado(2);
        System.out.println(quadrado2.calcularArea());

        System.out.println();
         */

        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(5);
        CalculadorArea calculador = new CalculadorArea();

        System.out.println("Soma das áreas: ");
        // Colocando variaveis para o construtor
        System.out.println(calculador.somarAreas(quadrado, circulo));

    }
}