public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();

        // Chamei um método atacar e passei como argumento uma String "Hydra"
        heroi.atacar("Hydra", "Golpe Duplo");

    }
}
