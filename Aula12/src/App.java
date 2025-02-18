import telefone.Contato;
import telefone.Contatos;
import telefone.Telefone;

public class App {
    public static void main(String[] args) {
        //
        Telefone telefone = new Telefone("4002 8922");
        // System.out.println(telefone.getContatos());

        Contato contatoA = new Contato("Lucas", "40897456");
        Contato contatoB = new Contato("Luan", "123456");
        Contato contatoC = new Contato("Maria", "789468");
        Contato contatoD = new Contato("Lorraine", "7889978");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
        System.out.println(telefoneContatos);

        System.out.println("Contatos filtrados: ");
        System.out.println(telefoneContatos.buscar("l"));

    }
}