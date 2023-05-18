package Modulos;

import java.util.List;

public abstract class Categoria {
    private Integer id;
    private List<Jogador> jogadores;
    private List<Competicao> competicoes;
    private List<Jogador> sub11;
    private List<Jogador> sub15;
    private List<Jogador> sub18;


    public List<Jogador> getJogadores(){
        return this.jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Jogador> getSub11() {
        return this.sub11;
    }

    public void setSub11(List<Jogador> sub11) {
        this.sub11 = sub11;
    }

    public void setSub15(List<Jogador> sub15) {
        this.sub15 = sub15;
    }

    public void setSub18(List<Jogador> sub18) {
        this.sub18 = sub18;
    }

    public List<Jogador> getSub15() {
        return this.sub15;
    }

    public List<Jogador> getSub18() {
        return this.sub18;
    }



    public void mostraJogadores(){
        for (Jogador jogador: jogadores) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Posição: " + jogador.getPosicao());
            System.out.println("Numero: " + jogador.getNumero());
        }
    }

    public void mostraCompeticoes(){
        for (Competicao competicao: competicoes) {
            System.out.println("Nome Torneio: " + competicao.getNomeTorneio());
            System.out.println("Premiação: " + competicao.getPremiacao());
        }
    }

    public void direcionaJogador(Jogador jogador){
        if(jogador.getIdade() >= 8 && jogador.getIdade() <= 11){
            getSub11().add(jogador);
            getJogadores().add(jogador);
            System.out.println("Jogador matriculado na categoria Sub-11");
        }else if (jogador.getIdade() >= 12 && jogador.getIdade() <=15){
            getSub15().add(jogador);
            getJogadores().add(jogador);
            System.out.println("Jogador matriculado na categoria Sub-15");
        }else if (jogador.getIdade() >= 16 && jogador.getIdade() <=18){
            getSub18().add(jogador);
            getJogadores().add(jogador);
            System.out.println("Jogador matriculado na categoria Sub-18");
        }else{
            System.out.println("Jogador não possui idade ideal para acessar nossa categoria de base");
        }
    }

    public void mostraTimes(){
        System.out.println("*********SUB-11*********");
        if(getSub11().isEmpty()){
            System.out.println("Não há jogadores matriculados nesta categoria");
        }
        for (Jogador membro: getSub11()) {
            membro.mostrarDados();
        }
        System.out.println("*********SUB-15*********");
        if(getSub11().isEmpty()){
            System.out.println("Não há jogadores matriculados nesta categoria");
        }
        for (Jogador membro: getSub15()){
            membro.mostrarDados();
        }
        System.out.println("*********SUB-18*********");
        if(getSub11().isEmpty()){
            System.out.println("Não há jogadores matriculados nesta categoria");
        }
        for (Jogador membro: getSub18()) {
            membro.mostrarDados();
        }
    }
}
