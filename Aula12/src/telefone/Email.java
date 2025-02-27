package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Email {
    private String emailOrigem;
    private String emailDestino;
    private String horarioEmail;
    private String mensagem;

    public Email(String emailOrigem, String emailDestino, String mensagem) {
        this.emailOrigem = emailOrigem;
        this.emailDestino = emailDestino;
        this.mensagem = mensagem;
        horario();
    }

    public void horario() {
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioEmail = formatadorData.format(horarioAgora);

    }

    @Override
    public String toString() {
        String informacao = String.format("Origem: %s\nDestino: %s\nHorário: %s\nMensagem: %s\n",
                emailOrigem, emailDestino, horarioEmail, mensagem);

        return informacao;
    }

}
