public class InterfacesJava {
    public static void main(String[] args) {
        /*
        * Interface: Contrato que quando assumido por uma classe deve ser implementado
        * */
        interfacesInicial();
    }

    private static void interfacesInicial(){

        ICaneta lapis = new Lapis(); //Orinentado a interface

        lapis.escrever("Testando");
        System.out.println(lapis.getCor());
        lapis.escreverComumATodas();

    }
}
