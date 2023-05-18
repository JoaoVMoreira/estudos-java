package Modulos;

public class Livro {
    private Integer id;
    private String nomeLivro;
    private Categoria categoria = null;
    private Boolean emprestado;

    public Livro(Integer id, String nomeLivro, Boolean emprestado) {
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.emprestado = emprestado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria, Livro livro) {
        this.categoria = categoria;
        categoria.addLivro(livro);
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void ExibeDados(){
        System.out.println("***********" + getNomeLivro() + "***********");
        System.out.println("ID: " + getId());
        if(getCategoria() == null){
            System.out.println("Categoria: Sem categoria definida");
        }else{
            System.out.println("Categoria: " + getCategoria().getNomeCategoria());
        }
        if(emprestado){
            System.out.println("Status: Emprestado");
        }else {
            System.out.println("Status: Disponivel");
        }
    }
}
