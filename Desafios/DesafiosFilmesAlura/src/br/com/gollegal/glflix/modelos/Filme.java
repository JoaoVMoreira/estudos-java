package br.com.gollegal.glflix.modelos;

public class Filme extends Titulo{

    private String diretor;

    public Filme(TituloOmdb meuTitulo) {
        super(meuTitulo);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNome() + "(" + this.getAnoLancamento();
    }
}
