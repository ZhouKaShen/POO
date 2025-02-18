package jogo;

import java.util.Random;

public class Guerreiro extends Personagem {

    @Override
    public void atacar() {
        int valorDado6Faces = this.rolarDado();
        System.out.printf("Você tirou um '%d' no dado.\n", valorDado6Faces);
        if (valorDado6Faces < 3) {
            System.out.println("O guerreiro errou o ataque!\n");
        } else if (valorDado6Faces == 6){
            System.out.println("O guerrreiro acertou um golpe especial!\n");
        } else {
            System.out.println("O guerreiro acertou o inimigo!\n");
        }
    }
}
