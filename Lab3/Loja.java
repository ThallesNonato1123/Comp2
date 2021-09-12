import java.util.ArrayList;

/**
 * Implementa uma loja virtual para produtos de qualquer tipo,
 * desde que tenham descrição, preço e dimensões.
 *
 * Essa classe será um singleton, isto é, permitiremos apenas
 * uma instância desde objeto no sistema.
 */
public class Loja {

    ArrayList<Usuario> user = new ArrayList<Usuario>();
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    private static final Loja instanciaUnica = new Loja();

    static {
        System.out.println("Estou subindo a classe Loja...");
    }

    protected Loja() {
        // escrevo código normalmente para o construtor
    }

    public static Loja getInstanciaUnica() {
        return instanciaUnica;
    }

    public void limparEstado() {

    }

    /**
     * Inclui no estoque da loja a quantidade informado do produto.
     *  @param produto o produto a ser incluído
     * @param quantidadeAIncluir a quantidade que será acrescentada à quantidade existente.
     */
    public void incluirProduto(Produto produto, int quantidadeAIncluir) {
        produtos.add(produto);
        produto.quantidadeEmEstoque += quantidadeAIncluir;
    }


    public void cadastrarUsuario(Usuario usuario) {
        user.add(usuario);
    }

    /**
     * Efetua a venda do produto desejado na quantidade especificada.
     *
     * @param produto o produto
     * @param quantidadeDesejada a quantidade
     *
     * @return um Recibo indicando a venda feita, se o produto existia (em quantidade suficiente)
     *         no estoque da loja; null, caso o usuário ou o produto sejam desconhecidos,
     *         ou não haja quantidade suficiente do produto desejado
     */

    public Recibo efetuarVenda(Produto produto, int quantidadeDesejada, Usuario usuario) {
        if(!user.contains(usuario) || produto.getQuantidadeEmEstoque() < quantidadeDesejada || !produtos.contains(produto)) return null;
        produto.quantidadeEmEstoque -= quantidadeDesejada;
        return new Recibo(usuario,produto,quantidadeDesejada*produto.precoEmReais());

    }



    /**
     * @param produto o produto a ser consultado
     *
     * @return a quantidade em estoque;
     *         0 se não houver nenhuma unidade;
     *         -1 se o produto não é sequer vendido pela loja
     */
    public int informarQuantidadeEmEstoque(Produto produto) {
        if(produto.quantidadeEmEstoque == 0 ) return 0;
        if(!produtos.contains(produto)) return -1;
        return produto.quantidadeEmEstoque;  // ToDo IMPLEMENT ME!!!
    }
}
