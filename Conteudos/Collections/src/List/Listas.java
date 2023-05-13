import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {

    //Coleção ordenada, onde podem ser inseridos valores duplicados. Os usuários podem acessar seu conteudo
    //atravez de seus respectivos indices.

    /*
    * -> ArrayList: Busca rapida de elemtneos, podem modificações são lentas.
    * -> LinkedList: Interface ligada, onde cada item buscado já possui conexão com o item seguinte, deixando
    * assim as alterações mais rapidas
    */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(); //-> Criando uma lista com a implementação de ArrayList
        numbers.add(98); //Adicionando item na lista
        System.out.println(numbers);
        listasOrdenadas();
        classesEmListas();
        linkedList();
    }

    private static void listasOrdenadas() {
        System.out.println("******* listas ordenadas ***********");
        List<String> lista = new ArrayList<String>();
        lista.add("Lista 1");
        lista.add("A segunda lista");
        lista.add("Mais uma lista");
        Collections.sort(lista); //-> Ordenando a lista

        System.out.println(lista);
    }
    private static void classesEmListas(){
        System.out.println("******* Classes em listas ***********");

        List<Aluno> lista = new ArrayList<Aluno>(); //Vinculando a classe Aluno a lista

        Aluno a = new Aluno("Joao", "ADS", 10); //Instanciando aluno
        Aluno b = new Aluno("Mateus", "Publicidade", 9);
        Aluno c = new Aluno("Leticia", "Mkt", 8);
        Aluno d = new Aluno("Antonio", "Mkt", 8);

        lista.add(a);//Adicionando aluno
        lista.add(b);
        lista.add(c);
        lista.add(d);

        System.out.println(lista);

        Collections.sort(lista); //Ordenando lista (Comparable)

        System.out.println(lista);
    }

    private static void linkedList(){
        System.out.println("******* Linked List ***********");
        List<String> lista = new LinkedList<String>(); //Nova interface
        lista.add("Lista 1");
        lista.add("A segunda lista");
        lista.add("Mais uma lista");
        Collections.sort(lista); //-> Ordenando a lista

        System.out.println(lista);
        System.out.println("//////////////////");
        for (String nome : lista){ //Listando todos os dados da lista
            System.out.println(nome);
        }
    }

    }
