package br.com.estudos.comprasCartao.Principais;

import br.com.estudos.comprasCartao.Modulos.Carrinho;
import br.com.estudos.comprasCartao.Modulos.Cartao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cartao cartao = new Cartao();
        List<Carrinho> lista = new ArrayList<Carrinho>();
        char testando = 'S';

        System.out.println("***********************");
        System.out.print("Informe o limite do cartão: ");
        cartao.setLimite(scan.nextDouble());

        while(cartao.isContinua()){
            Carrinho produto = new Carrinho();
            System.out.print("Informe o nome do produto: ");
            produto.setProduto(scan.next());
            System.out.print("Informe o valor do produto: ");
            produto.setPreco(scan.nextDouble());
            if(cartao.verificaLimite(produto.getPreco())){
                lista.add(produto);
                System.out.println("Produto cadastrado");
            }
            System.out.println("Deseja continuar? [S/N]");
            testando = scan.next().charAt(0);
            if(testando == 'N' || testando == 'n'){
                cartao.setContinua(false);
            }
        }

        lista.sort(Comparator.comparing(Carrinho::getPreco));
        for (Carrinho item: lista) {
            System.out.println(item);
        }

    }
}
