package classes;

public class CalculadorArea {
    /*
    Quadrado, Circulo
    Circulo, Quadrado
    Circulo, Circulo
    Quadrado, Quadrado
     */

    // FiguraGeometrica possui o método calcularArea
    public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }
}