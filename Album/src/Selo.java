import java.awt.*;

public class Selo implements Colecionavel {

    public float ValorNominal;
    public String Pais;

    public Selo(int posicao, String urlDaImagem, float valorMonetario) {

    }

    public float getValorNominal(){
        return this.ValorNominal;
    }

    public String getPais(){
        return this.Pais;
    }
    @Override
    public Image getImagem() {
        return null;
    }

    @Override
    public int getPosicao() {
        return 0;
    }
}
