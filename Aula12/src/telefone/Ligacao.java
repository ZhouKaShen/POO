package telefone;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }

    public Ligacao(Contato contatoOrigem, Contato contatoDestino) {
        // Agregação de classe na classe Ligacao
        this.numeroOrigem = contatoOrigem.getNumero();
        this.numeroDestino = contatoDestino.getNumero();
    }

    public void ligar() {
        System.out.println("Ligando para " + numeroDestino);
        System.out.println("Chamando ... ");
        System.out.println("O número está ocupado");
        // DateTimeFormatter -> formata a nossa data
        // data/mês/ano horario:minutos:ss
        // dd/MM/YYYY HH:mm:ss
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioLigacao = formatadorData.format(horarioAgora);
/*
        System.out.println(this.toString());
        System.out.println(this);
*/

    }

    @Override
    public String toString() {
        String informacao = String.format("Origem: %s\tDestino: %s\tHorário: %s",
                numeroOrigem,
                numeroDestino,
                horarioLigacao
        );
        return informacao;
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

}
