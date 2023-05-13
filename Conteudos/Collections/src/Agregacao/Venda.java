import java.util.List;

public class Venda {

    private Comprador comprador;

    private Vendedor vendedor;

    private Produto produtos;

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public void concretizaVenda(){
        System.out.println("Venda relizada! ");

    }
}
