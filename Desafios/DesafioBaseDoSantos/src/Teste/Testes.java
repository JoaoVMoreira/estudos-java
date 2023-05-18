package Teste;

import Modulos.Competicao;
import Modulos.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.setNome("Joao");
        jogador.setIdade(15);
        jogador.setPosicao("Zagueiro");
        jogador.setNumero(4);

        Jogador jogador1 = new Jogador();
        jogador1.setNome("Lucas");
        jogador1.setIdade(10);
        jogador1.setNumero(10);
        jogador1.setPosicao("Meia-Armador");

        Jogador jogador2 = new Jogador();
        jogador2.setNome("Lucas");
        jogador2.setIdade(18);
        jogador2.setNumero(11);
        jogador2.setPosicao("Ponta Esquerda");

        List<Jogador> playerList11 = new ArrayList<>(26);
        List<Jogador> playerList15 = new ArrayList<>(26);
        List<Jogador> playerList18 = new ArrayList<>(26);
        List<Jogador> jogadoresTot = new ArrayList<>();

        jogador.setSub11(playerList11);
        jogador.setSub15(playerList15);
        jogador.setSub18(playerList18);
        jogador.setJogadores(jogadoresTot);

        jogador.direcionaJogador(jogador);
        jogador.direcionaJogador(jogador1);
        jogador.direcionaJogador(jogador2);

        jogador.mostrarDados();
        jogador.mostraTimes();


    }
}
