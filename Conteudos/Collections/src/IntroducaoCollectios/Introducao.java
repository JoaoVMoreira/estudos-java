import java.util.ArrayList;
import java.util.List;

public class Introducao {
    public static void main(String[] args) {
        /*
        * As collections são um conjunto de classes que bucam a padronização das listas e suas utilidades
        *
        */

        //Criando uma lista

        List<Pessoa> pessoas = new ArrayList<>();   //List vinculada a classe pessoa

        pessoas.add(new Pessoa(01, "João")); //Adicionando uma pessoa a lista pessoas a partir da classe instanciada

        Pessoa a = pessoas.get(0); //Capturando o valor da pessoa presente no indice 0

        for(Pessoa pessoa : pessoas){ //Listando as pessoas presentes na lista pessoas
            System.out.println(pessoa);
        }
    }
}
