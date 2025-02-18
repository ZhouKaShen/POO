package jogo;

public class Arqueiro extends Personagem{
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        this.arma = "Arco longo";
    }

    @Override
    public String toString() {
        String informacoesPersonagem = super.toString();
        String informacoesArqueiro = String.format(" - Arma: %s", this.arma);
        String resultado = informacoesPersonagem + informacoesArqueiro;
        return resultado;
    }

    public void atacarComArma() {
        System.out.println("O arqueiro atacou com " + this.arma);
    }
}
