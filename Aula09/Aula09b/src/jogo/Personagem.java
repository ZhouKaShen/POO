package jogo;

/*
private, public, protected -> modificadores de acesso
final, abstract -> modificadores de sem acesso
 */
public abstract /*final*/ class Personagem {
    // final -> Nenhuma classe vai poder herdar essa classe por ser 'final'
    // Não vai poder criar uma classe que herda de Personagem através do 'final'
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;

    }

    public String toString() {
        String informacoes = String.format("%s (Nível: %d) - Classe: %s",
                this.nome, this.nivel, this.classe);
        return informacoes;
    }

    public final void atacarSemArma() {
        System.out.println("O arqueiro atacou sem arma");
    }

    public void atacar() {
        System.out.println("O personagem atacou");
    }

    public abstract void atacarComArma();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
