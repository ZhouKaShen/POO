public class Conta {
    private double saldo;

    public void depositar(int valor) {
        if (valor < 0) {
            System.out.println("Digite um valor maior que zero");
        } else {
            saldo = saldo + valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}