import java.util.ArrayList;
import java.util.List;

public class CalculadorIntersecaoIngenuo implements CalculadorIntersecao {

    @Override
    public List<Usuario> obterIntersecao(List<Usuario> lista1, List<Usuario> lista2) {
        List<Usuario> lista3 = new ArrayList<>();

        for(int i = 0 ; i < lista1.size();i++){
            for(int j = 0 ; j<lista2.size();j++){
                if(lista1.get(i) == lista2.get(j))
                    lista3.add(lista1.get(i));
            }
        }

        return lista3;
    }
}
