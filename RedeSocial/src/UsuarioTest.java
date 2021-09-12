import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
   @Test
    public void testarInterseccaoIngenuo(){
       long  inicio = System.currentTimeMillis();
       CalculadorIntersecao calculadora = new CalculadorIntersecaoIngenuo();
       Usuario user = new Usuario(12, calculadora);
       Usuario user2 = new Usuario(21,new CalculadorIntersecaoIngenuo());

       for(int i = 0; i < 100000; i++){
           Usuario user3 = new Usuario(i, calculadora);
           user.getAmigos().add(user3);
           user2.getAmigos().add(user3);
       }

       assertEquals( user.obterQuantidadeDeAmigosEmComum(user2), 100000);
       long  fim= System.currentTimeMillis() - inicio;
       System.out.println(fim + "ms");
   }

   @Test
   public void testarInterseccaoEsperta(){
       long  inicio = System.currentTimeMillis();
       CalculadorIntersecao calculadora = new CalculadorIntersecaoEsperto();
       Usuario user = new Usuario(12, calculadora);
       Usuario user2 = new Usuario(21,new CalculadorIntersecaoEsperto());

       for(int i = 0; i < 100000; i++){
           Usuario user3 = new Usuario(i, calculadora);
           user.getAmigos().add(user3);
           user2.getAmigos().add(user3);
       }

       assertEquals(user.obterQuantidadeDeAmigosEmComum(user2),100000);
       long  fim= System.currentTimeMillis() - inicio;
       System.out.println(fim + "ms");
   }
   @Test
    public void testarInterseccaoEspertaViaBuscaBinaria(){
        long  inicio = System.currentTimeMillis();
       CalculadorIntersecao calculadora = new CalculadorIntersecaoViaBuscaBinaria();
        Usuario user = new Usuario(12, calculadora);
        Usuario user2 = new Usuario(21,new CalculadorIntersecaoViaBuscaBinaria());

        for(int i = 0; i < 100000; i++){
            Usuario user3 = new Usuario(i, calculadora);
            user.getAmigos().add(user3);
            user2.getAmigos().add(user3);
        }

        assertEquals(user.obterQuantidadeDeAmigosEmComum(user2),100000);
       long  fim= System.currentTimeMillis() - inicio;
       System.out.println(fim + "ms");
    }

}