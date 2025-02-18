public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem.nome = "Luffy";
        personagem.raca = "Humano";
        personagem.idade = 19;
        personagem.nivel = 12;
        personagem.forca = 4;

        personagem2.nome = "Zoro";
        personagem2.raca = "Humano";
        personagem2.idade = 18;
        personagem2.nivel = 10;
        personagem2.forca = 2;

        personagem.mostrarInformacao();
        personagem.causarDano("Jet Gatling", "Crocodile");

        System.out.println();

        personagem2.mostrarInformacao();
        personagem2.causarDano("Ittoryu Iai Shishi Sonson", "Daz Bones");
    }
}
