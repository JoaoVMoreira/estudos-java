import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEstudos {
    public static void main(String[] args) {
        /*
        *
        * -> HashSet - Tem acesso de forma mais rapida aos dados, sem a possibilidade de ordenação e não
        *           permite valores duplicados;
        * -> TreeSet - Mais lento e os dados são ordenados de forma natual.
        *
        */

        hashSet();
        treeSet();
    }

    private static void hashSet(){
        Set<String> lista = new HashSet<String>(); //Criando lista

        lista.add("Teste 1"); //Adicionando valores a lista
        lista.add("Teste 2");
        lista.add("Teste 1");

        System.out.println(lista); //Imprimindo valores
    }

    private static void treeSet(){
        Set<String> lista = new TreeSet<>(); //Criando lista

        lista.add("Teste 1"); //Adicionando valores a lista
        lista.add("Teste 2");
        lista.add("Teste 3");

        System.out.println(lista); //Imprimindo valores
    }
}
