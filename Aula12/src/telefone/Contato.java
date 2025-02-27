package telefone;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
    // Nome: <nome>\tNúmero: <número>
        String informacao = String.format("Nome: %s\tNúmero: %s", this.nome, this.numero);
        return informacao;
    }
}
