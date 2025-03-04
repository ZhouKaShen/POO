package classes;

public class Circulo implements FiguraGeometrica{
    // Atributos
    private int raio;

    // Construtor
    public Circulo(int raio) {
        this.raio = raio;
    }

    // Métodos específicos da classe
    public double calcularArea() {
        // area = PI * raio^2
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    // Métodos getters e setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}