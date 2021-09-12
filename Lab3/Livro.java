public class Livro extends Produto {
    int numeroPag;
    String autor;
    String trecho;
    String nome;
    String editora;
    int anoPub;

    public Livro(String nome, String editora) {
        this.nome = nome;
        this.editora = editora;
    }

    private int numeroDePaginas() {
        return 0;  // ToDo IMPLEMENT ME!!!!
    }

    public String getTrechoEmDestaque() {
        return trecho;  // ToDo IMPLEMENT ME!!!!
    }

    public String getAutor() {
        return autor;  // ToDo IMPLEMENT ME!!!!
    }

    public int getAnoDePublicacao() {
        return anoPub;  // ToDo IMPLEMENT ME!!!!
    }
}
