// import classes.Pessoa;
import classes.Personagem;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        /*Pessoa pessoa = new Pessoa("Bob Esponja", 7, 1.60f, 47.5f);
        pessoa.imprimirDados();
        */

        /*System.out.format(
                "Nome: %s, Idade: %d, Altura: %.2fm",
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getAltura()
        );
        */

        String nome = JOptionPane.showInputDialog(null, "Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ");

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();

        /*
        Personagem personagem = new Personagem("Erico", "Guerreiro");
        System.out.println(personagem.getNome());
        */
    }
}