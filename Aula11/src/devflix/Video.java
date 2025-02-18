package devflix;

public class Video {
    private String nome;

    public Video(String nome) {
        this.nome = nome;
    }

    public void play() {
        System.out.printf("Play: %s", this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
