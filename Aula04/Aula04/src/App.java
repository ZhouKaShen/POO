public class App {
    public static void main(String[] args) {
        // private
        // public
        // protected
        // default -> package private -> pacote privado

        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirFilme("Venom 2");
    }
}