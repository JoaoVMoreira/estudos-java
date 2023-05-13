package br.com.estudos.comprasCartao.Modulos;

public class Carrinho{

    private String produto;
    private double preco;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + this.getProduto() + "Preço: " + this.getPreco();
    }
}
