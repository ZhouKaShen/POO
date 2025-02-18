package devflix;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;

    }

    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)) {
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: Série " + toString());

        } else {
            System.out.println("Episódio Inválido");
        }

    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0) {
            return false;
        }
        if (temporada > temporadas || episodio > episodiosPorTemporada) {
            return false;
        }
        return true;
    }

    // Métodos específicos da classe
    @Override
    public String toString() {
        // Serie <nome> <temporada>x0<episodio>
        // Serie The Last of Us 1x15
        String informacao = String.format("Série: %s %dx%02d (áudio %s, legenda %s)",
                getNome(),
                this.temporadaAtual,
                this.episodioAtual,
                getAudio(),
                getLegenda());
        return informacao;
    }

    // Métodos getters e setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

}
