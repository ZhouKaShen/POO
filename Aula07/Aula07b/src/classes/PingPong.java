package classes;

public class PingPong implements Jogo {
    @Override
    public void jogar() {
        System.out.println("Cutscene do jogo");
        System.out.println("Mostrando o Menu Inicial");
        System.out.println("Tocando música de fundo");
    }

    @Override
    public void fechar() {
        System.out.println("Salvar o progresso do jogo");
        System.out.println("Fechar o jogo");
    }
}