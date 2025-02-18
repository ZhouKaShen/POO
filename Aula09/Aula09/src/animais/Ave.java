package animais;

public class Ave extends Animal{
    private String voar;

    // construtor pode herdar:
    // this.atributo = parametro
    // super(atributo), setAtributo()
    public Ave(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.printf("%s voou\n", getNome());
    }
}