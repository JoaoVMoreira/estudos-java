package br.com.gollegal.verCep.modelos;

import br.com.gollegal.verCep.records.EnderecoRecord;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String Estado;
    private Integer ddd;

    public Endereco(EnderecoRecord meuEndereco){
        this.Estado = meuEndereco.uf();
        this.rua = meuEndereco.logradouro();
        this.cidade = meuEndereco.localidade();
        this.bairro = meuEndereco.bairro();
        this.ddd = Integer.valueOf(meuEndereco.ddd());
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", Estado='" + Estado + '\'' +
                ", ddd=" + ddd +
                '}';
    }
}
