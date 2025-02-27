package telefone;

import java.util.ArrayList;

public class Emails {
    private ArrayList<Email> emails;

    public Emails() {
        this.emails = new ArrayList<Email>();
    }

    public void adicionar(Email adicionarEmail) {
        emails.add(adicionarEmail);
    }

    @Override
    public String toString() {
        String informacao = "Contatos:\n";
        for (Email email : emails) {
            informacao = informacao + email.toString() + "\n";
        }
        return informacao;
    }
}
