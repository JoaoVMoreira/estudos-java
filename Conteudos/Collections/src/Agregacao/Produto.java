public class Produto {
    private Long id;
    private String nome;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void vendido(){
        System.out.println("Vendido");
    }
}
