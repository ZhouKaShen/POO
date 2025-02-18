package animais;

public class Cachorro extends Animal {
    public Cachorro(String nome){
        super(nome); // primeira linha -> contém a chamada do construtor da classe super
    }

    public void latir() {
        System.out.printf("%s latiu\n", getNome());
    }

    public void lamber() {
        System.out.printf("%s lambeu\n", getNome());
    }
}
