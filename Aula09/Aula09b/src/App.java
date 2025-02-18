import jogo.Arqueiro;

public class App {
    public static void main(String[] args) {
        /*
        Serie serieQualquer = new Serie("The Last of Us", 1, 2023);
        // System.out.println(serieQualquer.toString()); // explicita
        System.out.println(serieQualquer); // implicita
        */
        /*
        Personagem personagem = new Personagem("João");
        System.out.println(personagem);
        personagem.atacar();
        */

        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);
        arqueiro.atacar();
        arqueiro.atacarSemArma();

    }
}