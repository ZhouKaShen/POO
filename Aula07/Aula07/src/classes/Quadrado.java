package classes;

public class Quadrado implements FiguraGeometrica {
    // Atributos
    private int lado;

    // Construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    // Método específico
    public double calcularArea() {
        double area = Math.pow(lado, 2);
        return area;
    }

    // Métodos getters e setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}