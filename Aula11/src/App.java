import devflix.Filme;
import devflix.Serie;
import devflix.Video;

public class App {
    public static void main(String[] args) {
        // Polimorfismo
        // Poli -> muitas
        // morfo -> múltiplas formas

        // Permite que o mesmo nome, represente vários comportamentos diferentes

        // Um único nome -> pode ter comportamentos diferentes
        Filme filme = new Filme("Homem-aranha 2");

        filme.play();
        filme.play("japonês");
        filme.play("inglês", "português");

        Serie serie = new Serie("The Last of Us", 2, 10);
        serie.play(2,8);
        // Implícito -> apenas a variável serie
        // Explícito -> serie.toString();

    }
}