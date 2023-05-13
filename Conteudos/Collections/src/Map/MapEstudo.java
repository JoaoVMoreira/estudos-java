import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEstudo {
    public static void main(String[] args) {
        /*
        * -> HashMap Permite chaves e valores null, não garante a ordenação dos dados;
        * -> TreeMap Implementa a interface SortedMap, que permite a ordenação dos dados, perdendo
        *            desempenho.
        */

        hashMap();
        treeMap();
    }

    private static void hashMap(){
        Map<Integer, String> lista = new HashMap<>(); //Criando map
        lista.put(1, "Joao"); //Adicionando valores a map
        lista.put(2, "Marcos");
        lista.put(3, "Alberto");
        lista.put(4, "Bruno");


        for (String value : lista.values()){ //Listando todos os dados
            System.out.println(value);
        }

        for (Integer key : lista.keySet()){ // Listando as Keys
            System.out.println(key);
        }

        for (Map.Entry<Integer, String> e : lista.entrySet()){ //Lista chaves e valores
            System.out.println(e);
        }
    }
    private static void treeMap(){
        System.out.println("*************TreeMap*************");
        Map<Integer, String> lista = new TreeMap<>(); //Criando map
        lista.put(1, "Joao"); //Adicionando valores a map
        lista.put(2, "Marcos");
        lista.put(3, "Alberto");
        lista.put(4, "Bruno");

        System.out.println(lista.get(3));
    }
}
