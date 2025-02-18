package classes;

public class TiroAoAlvoOnline implements Jogo {
    @Override
    public void jogar() {
        System.out.println("Carregando o Jogo");
        System.out.println("Se conectando ao Servidor...");
        System.out.println("Carregando Partida");
    }

    @Override
    public void fechar() {
        System.out.println("Salvar o Progresso do Jogo no Servidor");
        System.out.println("Sair da Partida");
        System.out.println("Sair do Jogo");
    }
}