import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        Boolean continua = true;
        String nome;
        Character pergunta, sexo;

        while(continua){
            System.out.print("Informe o nome: ");
            nome = scan.next();
            scan.nextLine();
            System.out.print("Informe o sexo: ");
            sexo = scan.next().charAt(0);
            scan.nextLine();

            if(sexo == 'M' || sexo == 'm'){
                masculino.add(nome);
            }else if(sexo == 'F' || sexo == 'f'){
                feminino.add(nome);
            }
            System.out.println("Deseja continuar? ");
            pergunta = scan.next().charAt(0);

            if(pergunta == 'N' || pergunta == 'n'){
                continua = false;
            }
        }

        for (String data : masculino){
            System.out.println(data);
        }

        for (String data : feminino){
            System.out.println(data);
        }
    }
}
