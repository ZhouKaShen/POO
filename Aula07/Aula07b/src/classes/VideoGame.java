package classes;

public class VideoGame {
    private boolean estaLigado;
    private Jogo jogo; // null

    public void ligar() {
        System.out.println("Ligando o Video Game...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo) {
        if (estaLigado == true) {
            System.out.println("Iniciando o Jogo...");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("Video está desligado!");
        }
    }

    public void fechar() {
        if (estaLigado == true) {
            System.out.println("Fechando o Jogo...");
            boolean temJogoRodando = jogo != null;
            if (temJogoRodando == true) {
                jogo.fechar();
                jogo = null; // definindo valor null, significa que não está rodando
            } else {
                System.out.println("Não tem nenhum jogo rodando!");
            }
        } else {
            System.out.println("Videogame está desligado!");
        }
    }
}
