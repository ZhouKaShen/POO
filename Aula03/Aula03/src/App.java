import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;

public class App {
    public static void main(String[] args) {
        br.com.devflix.videos.Filme filme = new br.com.devflix.videos.Filme(); // Acessando o pacote videos e pegando a classe Filme
        Filme filme2 = new Filme();

        Novela novela = new Novela();

        Documentario documentario = new Documentario();

        Serie serie = new Serie();

        Janela janelinha = new Janela();
        MiniaturaVideo miniatura = new MiniaturaVideo();

        BotaoPlay botaoPlay = new BotaoPlay();
    }
}
