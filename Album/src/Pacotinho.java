import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pacotinho {

    public Repositorio repositorio;
    Random random = new Random();
    private Colecionavel[] figurinhas;

    public Pacotinho(Repositorio repo, int[] posicoesDesejadas) {
       this.repositorio = repo;
       this.figurinhas = new Figurinha[posicoesDesejadas.length];
       for(int i=0 ; i < posicoesDesejadas.length ; i++){
           figurinhas[i]  =  repo.getFigurinha(posicoesDesejadas[i]);
       }
    }

    /**
     * Produz um pacotinho com quantFigurinhas sorteadas aleatoriamente
     * dentre aqueles presentes no repositório informado.
     *
     * @param repo o repositório desejado
     * @param quantFigurinhas a quantidade de figurinhas a constar no pacotinho
     */
    public Pacotinho(Repositorio repo, int quantFigurinhas) {
            this.repositorio = repo;
            this.figurinhas = new Figurinha[3];
            for(int i=0 ; i < 3 ; i++){
                figurinhas[i]  =  repo.getFigurinha(random.nextInt(199) + 1);
            }
    }

    public Colecionavel[] getFigurinhas() {
        return figurinhas;  // ToDo IMPLEMENT ME!!!
    }
}
