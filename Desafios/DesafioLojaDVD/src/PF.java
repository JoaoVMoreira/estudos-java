public class PF {

    private String nomePF;
    private String cpf;

    public PF(String nomePF, String cpf){
        this.nomePF = nomePF;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePF() {
        return nomePF;
    }

    public void setNomePF(String nomePF) {
        this.nomePF = nomePF;
    }

    @Override
    public String toString() {
        return "PF{" +
                "nomePF='" + nomePF + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
