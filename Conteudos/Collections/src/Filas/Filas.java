import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        /*
        * -> Deque - Possui uma organização de dados em fila, tendo saida e entrada pelas duas extremidades;
        * -> Queue - Possui uma organização de dados em fila, onde a saida ocorre por uma lado
        *            e a entrada por outro;
        */

        listasQueque();
        listasDeque();
    }

    private static void listasQueque(){
        Queue<String> queue = new PriorityQueue<String>(); //Criando uma fila queue
        queue.add("Teste 1"); //Adicionando valores a queue
        queue.add("Teste 2");
        queue.add("Teste 3");

        while(queue.size() != 0){ //Listando e removendo os dados da queue
            System.out.println(queue.remove());
        }
    }

    private static void listasDeque(){

        System.out.println("************** Deque **************");
        System.out.println("");
        Deque<String> ad = new ArrayDeque<String>();

        ad.add("Teste 1");
        ad.add("Teste 2");
        ad.add("Teste 3");

        Deque<String> d = new ArrayDeque<String>();

        d.add("Teste 4");
        d.add("Teste 5");
        d.addAll(ad); //Adicionando todos os dados da Deque ad na Deque d.

        System.out.println(d);

        System.out.println(d.contains("Teste 1"));
        System.out.println(d.contains("Teste 8")); //Verifica se o valor informado está presente na lista
        System.out.println(d.peekFirst()); //Retorna o primeiro valor da lista
        System.out.println(d.peekLast()); //Retorna o ultimo valor da lista

    }

}
