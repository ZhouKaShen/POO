package classes;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    // Construtor
    // <modificador> nomeDaClass()
    public Pessoa(String nome, int idade, float altura, float peso) {
        System.out.println("Uma pessoa acaba de nascer! Parabéns!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        // Não colocar métodos dentro de um construtor
    }

    public void imprimirDados() {
        System.out.format("Nome: %s, Idade: %d, Altura: %.2fm \n",
                nome,
                idade,
                altura
        );
     }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}