package modulos;

public class Audio {
    private String nomeAudio;
    private Integer duracao;
    private Boolean tocando = false;
    private String categoria;

    public String getNomeAudio() {
        return nomeAudio;
    }

    public void setNomeAudio(String nomeAudio) {
        this.nomeAudio = nomeAudio;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean TocaAudio(){
        System.out.println(getNomeAudio() + " está tocando!");
        setTocando(true);
        return true;
    }

    public void ExibeAudio(){
        System.out.println("Nome: " + getNomeAudio());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Tocando?: " + getTocando());
    }
}
