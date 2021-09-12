import java.util.Scanner;

public class primos {
    
    
    public static int[] obterprimoscrivo(int n){
        int[] lista;
        lista = new int[n/2];
        int k = 3;
        int temp = 0;

        for(int i = 0 ; i < lista.length; i++){
            lista[i] = 2 * (i+1)  + 1; 
            if(lista[i] > n){
                lista[i] = 0;
            }
        }
        
        for(int j  = k ; j < Math.round((Math.sqrt(n))) ; j+=2){
            for(int i = temp + k; i < lista.length; i += k){
             lista[i] = 0;
                }
             temp ++;
             k+=2;
    }
        return lista;

    }


    public static boolean primo(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0)
                return false;   
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] listacrivo;
        int [] listaprimo;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        
        listacrivo = new int[n/2];
        listacrivo = obterprimoscrivo(n);
        
        
        System.out.print("lista com crivo: " + 2 + " ");
        
        long tempoInicial = System.currentTimeMillis();
        
        for(int i = 0 ; i < listacrivo.length; i++){
            if(listacrivo[i] != 0)
            System.out.print(listacrivo[i] + " ");
        }
            System.out.println();
        
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println( "Tempo Crivo : " + (tempoFinal - tempoInicial) + " milisegundos");
        
        System.out.print("lista sem crivo: " +  " ");
        
        long ti = System.currentTimeMillis();
        for (int i = 2; i <= n; i++) {
            if( primo(i) )
            System.out.print(i + " ");
            }
        long tf = System.currentTimeMillis();    
        System.out.println( "Tempo Normal : " + (tf - ti) + " milisegundos");    

    }
}
