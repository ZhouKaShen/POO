public class App {
    static int soma = 0;

    public static void imprimirMensagem() {
        System.out.println("Olá, deixa o like no video por favor!");
    }
    public static void main(String[] args) {
        Carro ferrari = new Carro("Ferrari", 2023);
        Carro fusca = new Carro("Fusca", 1999);

        ferrari.anoCompra = 2007;
        fusca.anoCompra = 2020;
        // Não importa se você mudar o valor da variável, ela vai pegar o valor mais recente

        imprimirMensagem();
        System.out.println(ferrari.getNome());
        System.out.println(ferrari.anoCompra);
        System.out.println(fusca.getNome());
        System.out.println(fusca.anoCompra);
    }

}