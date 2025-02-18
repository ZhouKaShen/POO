package devflix;

public class Filme extends Video {
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "português";
        this.legenda = "nenhuma";
    }

    // Sobrescrita/sobreposição de método da classe herdada Video
    @Override
    public void play() {
        this.audio = audio;
        System.out.println("Play: Filme " + getNome());

    }

    // sobrecarga de método
    public void play(String audio) {
        this.audio = audio;
        if (audio == "português") {
            this.legenda = "nenhuma";
        } else {
            this.legenda = "português";
        }
        System.out.println("Play: " + toString());
    }

    // sobrecarga de método
    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString());
    }

    @Override
    public String toString() {
        String informacao = String.format("Filme %s (áudio %s, legenda %s)", getNome(), audio, legenda);
        return informacao;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void SetLegenda() {
        this.legenda = legenda;
    }

}
