import animais.Animal;
import animais.*;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Gato");
        gato.miar();

        Dragao dragao = new Dragao("Dragaozinho");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombo = new Pombo("Pombo Viajante");
        pombo.voar();
        pombo.enviarCarta();
        pombo.fazerPruh();
        System.out.println(pombo.getCartasEnviadas());

    }
}
