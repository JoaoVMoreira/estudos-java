package Teste;

import Modulos.Item;
import Modulos.Pedidos;
import Modulos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setId(00);
        produto.setNome("Leite ninho");
        produto.setDescricao("O melhor que temos");
        produto.setValor(20.00);
        produto.setCodigoDeBarras("156ds516");

        Produto produto1 = new Produto(01, "Sabao", "Mais limpo possivel", "568898dw", 15.00);
        Produto produto2 = new Produto(02, "Miojo", "Delicioso e rapido", "889789ef", 10.00);

        Item item = new Item();
        item.setId(10);
        item.setQuantidade(5);
        item.setSobTotal(15.00);
        item.setProduto(produto);

        Item item1 = new Item(11, 2, 20.00, produto1);
        Item item2 = new Item(11, 2, 20.00, produto2);

        Pedidos pedido = new Pedidos();
        pedido.setData(null);
        pedido.setId(01);
        pedido.setValorCupom(10.00);
        pedido.setValorFrete(5.00);
        pedido.setValorTotal(50.00);

        List<Item> itemList = new ArrayList<Item>(3);
        itemList.add(item);
        itemList.add(item1);
        itemList.add(item2);

        pedido.setListaItens(itemList);

        System.out.println("***********PEDIDOS***********");
        System.out.println("Pedido: " + pedido.getId());
        System.out.println("Valor Cupom: " + pedido.getValorCupom());
        System.out.println("Valor Frete: " + pedido.getValorFrete());
        System.out.println("Valor Total: " + pedido.getValorTotal());

        for (Item i: pedido.getListaItens()
             ) {
            System.out.println("***********Detalhes Produto***********");
            System.out.println("Quantidade: " + i.getQuantidade());
            System.out.println("Valor Parcial: " + i.getSobTotal());
            System.out.println("Nome: " + i.getProduto().getNome());
            System.out.println("Descricao: " + i.getProduto().getDescricao());
            System.out.println("Valor Produto: " + i.getProduto().getValor());
            System.out.println("Codigo de barras" + i.getProduto().getCodigoDeBarras());
        }

    }


}
