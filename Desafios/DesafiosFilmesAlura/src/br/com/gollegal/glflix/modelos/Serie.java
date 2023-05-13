package br.com.gollegal.glflix.modelos;

import br.com.gollegal.glflix.excessoes.QuantidadeDeCaracteresException;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(TituloOmdb meuTitulo) throws QuantidadeDeCaracteresException {
        super(meuTitulo);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getMinutos(){
        return minutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
