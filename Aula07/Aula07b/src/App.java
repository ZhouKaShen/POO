import classes.PingPong;
import classes.TiroAoAlvoOnline;
import classes.VideoGame;
import classes.Xadrez;

public class App {
    public static void main(String[] args) {
        VideoGame playStation = new VideoGame();
        playStation.ligar();
        playStation.jogar(new TiroAoAlvoOnline());
        playStation.fechar();
    }
}
