public class Pessoa {
        public String nome;
        public int anodenascimento;

    public final static int TAMANHO_MAXIMO_DO_NOME = 30;

    public String getNome() {
        this.nome = nome;
        return this.nome;
    }
    public void setNome(String nome) {
        if (nome.length() > TAMANHO_MAXIMO_DO_NOME) {
            // ToDo: lançar uma exceção!!!
            return;
        }

        this.nome = nome;
    }

    public int getAnodenascimento() {
        return this.anodenascimento;
    }
}