import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Informe o nome de pessoas separado por virgula: ");
        String pessoas = scan.next();

        for (String pessoa : pessoas.split(",")){
            nomes.add(pessoa);
        }

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
