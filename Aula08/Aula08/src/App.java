import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Vegeta";
        arrayEstatico[4] = "Bob Esponja";

        // Classe nomeObjeto = new Classe();
        // ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku"); // indice 0
        arrayDinamico.add("Maria"); // indice 1
        arrayDinamico.add("Pedro"); // indice 2
        arrayDinamico.add("Vegeta"); // indice 3
        arrayDinamico.add("Bob Esponja"); // indice 4
        arrayDinamico.add("Nome qualquer"); // indice 5

        System.out.println("Isso é um Array Estático!");
        for (int i = 0; i < arrayEstatico.length; i++) {
            System.out.println(arrayEstatico[i]);
        }

        System.out.println();
        System.out.println("Remover o Pedro");
        arrayDinamico.remove("Pedro");
        // arrayDinamico.remove(2); remove -> remove um elemento

        System.out.println("Isso é um ArrayList");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }


    }
}