public class Produto {

    private float produtoPreco;
    private Dimensoes dimensao;
    private int peso;
    public int quantidadeEmEstoque = 0;
    public String descricao;
    public String url;

    public Produto(String descricao, String urlDaImagem) {
        this.descricao = descricao;
        this.url = urlDaImagem;
    }

    public Produto() {

    }


    /**
     * @return uma descrição textual do produto
     */
    public String getDescricao() {
        return descricao;  //
    }

    public int getPesoEmGramas()
    {
        return peso;
    }

    public Dimensoes getDimensoes() {
        return dimensao;  // ToDo IMPLEMENT ME!!!
    }

    public void setPrecoEmReais(float preco) {
        produtoPreco = preco;

    }

    public float precoEmReais() {
        return produtoPreco;
    }

    public String getUrlDaImagem(String urlDaImagem) {
        return urlDaImagem;
    }

    public int getQuantidadeEmEstoque(){
        if(quantidadeEmEstoque>0) return -1;
        return quantidadeEmEstoque;
    }

}
