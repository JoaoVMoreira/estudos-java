public class PJ {

    private String nomePJ, cnpj;


    public PJ(String nomePJ, String cnpj){
        this.nomePJ = nomePJ;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomePJ() {
        return nomePJ;
    }

    public void setNomePJ(String nomePJ) {
        this.nomePJ = nomePJ;
    }

    @Override
    public String toString() {
        return "PJ{" +
                "nomePJ='" + nomePJ + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
