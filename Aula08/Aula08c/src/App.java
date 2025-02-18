import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        // sort -> ordenar
        // Collections.sort(numeros); // Crescente
        Collections.sort(numeros, Collections.reverseOrder()); // Descrecente

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println();

        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Goku");
        nomes.add("Zoro");
        nomes.add("Abelha");
        nomes.add("Bob Esponja");

        Collections.sort(nomes);
        Collections.sort(nomes, Collections.reverseOrder());

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
