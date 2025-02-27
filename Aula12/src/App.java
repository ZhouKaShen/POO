import telefone.*;

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

/*        Ligacao ligacao = new Ligacao("40028922", "12345678");
//        ligacao.ligar();
//        System.out.println(ligacao);
*/

        // telefone.ligar("789468");
        // telefone.ligar(contatoA.getNumero());
        telefone.ligar(contatoA);
        telefone.ligar(contatoB);
        telefone.ligar(contatoC);
        telefone.ligar(contatoC);
        telefone.ligar(contatoD);

        System.out.println(telefone.getChamadas());

        Email emailA = new Email("lucas@gmail.com", "luan@gmail.com", "Olá, Lucas. Prazer em te conhecer.");
        Email emailB = new Email("maria@gmail.com", "lorraine@gmail.com", "Olá, Maria. Eu sou a Lorraine.");
        Email emailC = new Email("ana@gmail.com", "julia@gmail.com", "Olá, Julia. Quer ser minha amiga?");

        Emails emails = new Emails();
        emails.adicionar(emailA);
        emails.adicionar(emailB);
        emails.adicionar(emailC);

        System.out.println(emails);

    }
}