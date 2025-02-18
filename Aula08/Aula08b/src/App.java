import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        /* Tipos Primitivos -> Wrapper Class
           int              -> Integer
           float            -> Float
           double           -> Double
           char             -> Character
         */

        /*
        Pessoas joao = new Pessoas("João", 20);
        Pessoas maria = new Pessoas("Maria", 22);
        Pessoas pedro = new Pessoas("Pedro", 75);
        */

        ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
        pessoas.add(new Pessoas("João", 20));
        pessoas.add(new Pessoas("Maria", 22));
        pessoas.add(new Pessoas("Pedro", 75));

        /*
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);
        */

        for (Pessoas pessoa : pessoas) {
            System.out.println(pessoa.getNome() + "," + pessoa.getIdade());
        }
    }
}