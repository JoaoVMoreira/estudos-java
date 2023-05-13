package br.com.gollegal.glflix.modelos;

import br.com.gollegal.glflix.excessoes.QuantidadeDeCaracteresException;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(TituloOmdb meuTitulo) throws QuantidadeDeCaracteresException { //Criando construtor que recebe o record como parâmetro, tal qual possui um throws para a exception que criamos
        this.nome = meuTitulo.title(); //Atribuindo titulo a nome
        this.anoLancamento = Integer.valueOf(meuTitulo.year()); //Transformando ano retornado em Int e atribuindo a anoLancamento
        this.duracaoEmMinutos = Integer.valueOf(meuTitulo.runtime().substring(0,2)); //Transformando runtime em int, considerando somente os 2 primeiros caracteres e atribuindo a variavel duracaoEmMinutos

        if(meuTitulo.year().length() > 4){ //Criando exception em cao se year ter mais de digitos
            throw new QuantidadeDeCaracteresException("Não foi possivel seguir pois a variavel Ano possui " +
                    "mais de 4 digitos"); //Throw new exception e adicionando a mensagem padrão.
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /******************************************/

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void avalia(double nota){
        somaDasAvaliacoes+=nota;
        totalAvaliacoes++;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
    }

    public Double getMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
