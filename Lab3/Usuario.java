public class Usuario{

    private final String nome;
    private final long cpf;
    private final String end;


    public Usuario(String nome, long cpf, String end) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }


    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getEnd() {
        return end;
    }


}

