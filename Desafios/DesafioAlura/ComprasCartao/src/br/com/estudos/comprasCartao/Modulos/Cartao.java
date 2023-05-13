package br.com.estudos.comprasCartao.Modulos;

public class Cartao extends Carrinho{
    private double limite;
    private boolean continua = true;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isContinua() {
        return continua;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }

    public boolean verificaLimite(double preco){
        if(preco > getLimite()){
            this.continua = false;
            System.out.println("Valor acima do do limite.");
            return false;
        }
        setLimite(this.limite -= preco);
        return true;
    }
}
