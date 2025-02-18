public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Conta conta = new Conta();
        // modificar -> setNomeVariavel
        // pegar -> getNomeVariavel
        pessoa.setNome("Bob Esponja");
        pessoa.setIdade(13);
        pessoa.setAltura(1.60);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        System.out.println(conta.getSaldo());
        conta.depositar(200);
        System.out.println(conta.getSaldo());
    }
}