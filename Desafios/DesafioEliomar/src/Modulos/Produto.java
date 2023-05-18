package Modulos;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private String codigoDeBarras;
    private Double valor;

    public Produto(){

    }

    public Produto(Integer id, String nome, String descricao, String codigoDeBarras, Double valor){
        this.valor = valor;
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
