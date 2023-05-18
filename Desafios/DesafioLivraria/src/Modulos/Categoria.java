package Modulos;
import java.util.List;


public class Categoria {
    private String nomeCategoria;
    private List<Livro> livros;

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void addLivro(Livro livro){
        getLivros().add(livro);
    }

    public void ExibeLivro(){
        System.out.println("********LIVROS NA CATEGORIA********");
        if(getLivros() == null){
            System.out.println("Sem livros cadastrados nesta categoria");
        }else{
            for (Livro livro: getLivros()) {
                System.out.print(livro.getNomeLivro());
                System.out.println(livro.getEmprestado());
            }
        }

    }
}
