package Modulos;

public class Jogador extends Categoria{
    private String nome;
    private Integer idade;
    private String posicao;
    private Integer numero;

    public Jogador(){

    }
    public Jogador(String nome, Integer idade, String posicao, Integer numero) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Numero: " + getNumero());
    }




}
