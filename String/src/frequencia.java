import java.util.*;

public class frequencia {


    public static void pegarChave(HashMap<Character,Integer> map, int valor){
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (Objects.equals(valor, entry.getValue())) {
                System.out.print(entry.getKey() + ": ");
                System.out.print(entry.getValue());
            }
        }
    }


    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();

        String s = "arara";

        for(int i =0 ; i <s.length(); i++){
            char caractere = s.charAt(i);
            Integer val = map.get(caractere);
            if(val != null){
                map.put(caractere,val + 1);
            }else{
                map.put(caractere,1);
            }
        }
            pegarChave(map,Collections.max (map.values()));
    }
}
