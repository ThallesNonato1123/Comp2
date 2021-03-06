import javax.imageio.ImageIO;
import java.awt.*;

public class Figurinha implements Colecionavel {

    private final Image imagem;
    private final int posicao;

    public Figurinha(int posicao, String urlDaImagem) {
        this.imagem = obterImagem(urlDaImagem);
        this.posicao = posicao;
    }

    private Image obterImagem(String url) {
      return imagem;
    }

    public Image getImagem() {
        return this.imagem;
    }

    public int getPosicao() {
        return posicao;
    }
}
