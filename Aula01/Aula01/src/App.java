public class App {
    public static void main(String[] args) {
        // Iphone 12, tela de 6.1'', 256gb
        // Galaxy Note 20 Ultra, tela de 6.9'', 256gb
        // Xiaomi Mi 11 Pro, tela de 6.81'', 128gb
        // <tipoVariavel> nomeVariavel = valor;

        // Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();// Objeto celularA
        celularA.nome = "Iphone 12"; // Com o estado de nome definido para Iphone 12
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular(); // Objeto celularB
        celularB.nome = "Galaxy Note 20 Ultra"; // Com o estado de nome definido para Galaxy Note 20 Ultra
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular(); // Objeto celularC
        celularC.nome = "Xiaomi Mi 11 Pro"; // Com o estado de nome definido para Xiaomi Mi 11 Pro
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f'', com %dgb e Sistema Operacional %s%n",
                celularA.nome,
                celularA.tamanhoTela,
                celularA.espacoArmazenamento,
                celularA.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f'', com %dgb e Sistema Operacional %s%n",
                celularB.nome,
                celularB.tamanhoTela,
                celularB.espacoArmazenamento,
                celularB.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f'', com %dgb e Sistema Operacional %s%n",
                celularC.nome,
                celularC.tamanhoTela,
                celularC.espacoArmazenamento,
                celularC.sistemaOperacional);

    }
}