package Modulos;

public class Cliente {
    private Integer carteirinha;
    private String nome;
    private String cpf;
    private Integer idade;
    private Livro livroEmprestado;

    public Cliente(){

    }

    public Cliente(Integer carteirinha, String nome, String cpf, Integer idade) {
        this.carteirinha = carteirinha;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Integer getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(Integer carteirinha) {
        this.carteirinha = carteirinha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public void ExibeDados(){
        System.out.println("************" + getNome() + "************");
        System.out.println("Carterinha: " + getCarteirinha());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        if(getLivroEmprestado() == null){
            System.out.println("Livro emprestado: Sem livros emprestados");
        }else{
            System.out.println("Livro emprestado: " + getLivroEmprestado().getNomeLivro());
        }
    }

    public void pegaLivroEmprestado(Livro livro){
        if(livro.getEmprestado()){
            System.out.println("O livro já está emprestado");
        }else{
            livro.setEmprestado(true);
            setLivroEmprestado(livro);
        }
    }

    public void devolveLivro(){
        if(getLivroEmprestado() == null){
            System.out.println("Ainda não possui livros emprestados");
        }else{
            getLivroEmprestado().setEmprestado(false);
            setLivroEmprestado(null);
            System.out.println("Livro devolvido!");
        }
    }
}
