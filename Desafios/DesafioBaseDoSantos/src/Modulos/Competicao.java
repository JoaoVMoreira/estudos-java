package Modulos;

public class Competicao {
    private String nomeTorneio;
    private Integer idadeMax;
    private Double premiacao;

    public Competicao(){

    }

    public Competicao(String nomeTorneio, Integer idadeMax, Double premiacao) {
        this.nomeTorneio = nomeTorneio;
        this.idadeMax = idadeMax;
        this.premiacao = premiacao;
    }

    public String getNomeTorneio() {
        return nomeTorneio;
    }

    public void setNomeTorneio(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
    }

    public Integer getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(Integer idadeMax) {
        this.idadeMax = idadeMax;
    }

    public Double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(Double premiacao) {
        this.premiacao = premiacao;
    }

}
