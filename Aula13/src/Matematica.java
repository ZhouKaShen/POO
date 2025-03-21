public class Matematica {
    private static double valorPI = 3.14;
    /*
    O modificador static faz com que o valor do atributo valorPI seja compartilhado entre todas
    as instâncias da classe. Ou seja, o atributo valorPI será acessível de maneira global dentro da classe,
    sem a necessidade de criar uma instância da classe(ele chama direto da classe sem instanciar).
     */

    public static int somar(int numeroA, int numeroB) {
        return numeroA + numeroB;
    }

    public static double calcularAreaQuadradada(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        // pi * raio * raio
        // pi = 3.14
        double area = valorPI * raio * raio;
        return area;
    }

    public static double calcularDobroAreaCirculo(double raio) {
        double area = calcularAreaCirculo(raio);
        return 2 * area;
    }
}
