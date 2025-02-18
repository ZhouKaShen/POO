import java.util.Random;

public class Personagem {
    String nome;
    String raca;
    int idade;
    int nivel;
    int forca;

    int dado20Faces() {
        Random random = new Random();

        int danoAleatorio = random.nextInt(1,21);
        return danoAleatorio;
    }

    void causarDano(String habilidade, String alvo) {
        int danoDado = forca + dado20Faces();
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.%n",
                              nome, alvo, forca);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.%n",
                              nome, habilidade, alvo, danoDado);
        }
    }

    void mostrarInformacao() {
        System.out.format("Nome: %s, Raça: %s, Idade: %d, Nível: %d, Força: %d%n",
                                nome, raca, idade, nivel, forca);
    }
}
