public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setPessoaFisica(new PF("Joao", "519.783.658-02"));
        pessoa.setPessoaJuridica(new PJ("Gol Legal", "51.976.658/0001-02"));
        System.out.println(pessoa.getPessoaFisica());
        System.out.println(pessoa.getPessoaJuridica());
    }
}