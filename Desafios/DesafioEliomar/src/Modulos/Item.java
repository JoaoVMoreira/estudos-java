package Modulos;

public class Item {
    private Integer id;
    private Integer quantidade;
    private Double sobTotal;

    private Produto produto;

    public Item(){

    }

    public Item(Integer id, Integer quantidade, Double sobTotal, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.sobTotal = sobTotal;
        this.produto = produto;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSobTotal() {
        return sobTotal;
    }

    public void setSobTotal(Double sobTotal) {
        this.sobTotal = produto.getValor() * getQuantidade();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
