import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // Método
    // Void -> significa que não está retornando
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n",
                                       nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();

        // 1...20
        // nextInt(): 0...19
        // nextInt(): (0 -> 1...19) -> (0...20)
        // nextInt(): 1...21
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    // Método que não retorna nada e recebe um parâmetro alvo que é do tipo String
    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();

        // "" o tamanho (.length) é igual 0
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n",
                              nome, alvo, forca);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n",
                              nome, habilidade, alvo, danoCausado);
        }
    }
}
