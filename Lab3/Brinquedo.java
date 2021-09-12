public class Brinquedo extends Produto {
    public String marca;
    public int idadeMinima;

    public Brinquedo(String descricao) {
        super();
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;  // ToDo IMPLEMENT ME!!!
    }

    public int getIdadeMinimaRecomendada() {
        return idadeMinima;  // ToDo IMPLEMENT ME!!!
    }
}
