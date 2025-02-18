package classes;

public class Xadrez implements Jogo {
    @Override
    public void jogar() {
        System.out.println("Exibir Menu");
        System.out.println("Exibir vídeo de jogadas no fundo");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo de Xadrez");
    }
}