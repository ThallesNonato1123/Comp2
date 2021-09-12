public class Recibo {
    public float valortotal;
    Usuario usuario;
    String mensagem;
    private  Produto produto;
    private int quantidade;

    public Recibo(Usuario usuario, Produto produto, float valortotal) {
        this.usuario = usuario;
        this.produto = produto;
        this.valortotal = valortotal;
    }

    public float getValorTotalDaCompra() {

        return  valortotal;  // ToDo IMPLEMENT ME!!!
    }

    public Usuario getUsuario() {
        return usuario;  // ToDo IMPLEMENT ME!!!
    }

    public String toString() {
        return String.format("Recibo no valor de R$%.2f para %s referente à compra de %d unidades de %s",
                valortotal,usuario.getNome(),quantidade,produto.getDescricao());
    }
}
