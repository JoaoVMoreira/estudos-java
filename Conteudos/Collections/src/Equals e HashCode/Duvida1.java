import javax.sound.midi.Soundbank;

public class Duvida1 {
    /*
    *
    * Equals e HashCode
    *
    * -> Equals: Realiza a comparação de duas classes;
    *
    * -> HashCode: Valores de memoria aplicados a cada classe instanciada, que, por padrão são diferentes
    *             umas das outras, independente do conteudo nelas presente.
    * */
    public static void main(String[] args) {

        Nomes nome1 = new Nomes("Joao", "Moreira");
        Nomes nome2 = new Nomes("Joao", "Moreira");

        System.out.println(nome1); //Imprimindo os espaços da memora onde as classes estão alocadas
        System.out.println(nome2);

        System.out.println(nome1.equals(nome2)); //Verificando se nome1 e nome2 são iguais

        /*
        * Mesmo sendo iguais o sistema retorna false uma vez que o hashCode das variaveis citadas são diferentes
        */

        System.out.println(nome1.hashCode());//Imprimindo o hashCode
        System.out.println(nome2.hashCode());

        /*
        * Para que os valores de hashcode sejam iguais é necessário implementar o metodo de equal e hashcode
        * na classe
        */
    }
}
