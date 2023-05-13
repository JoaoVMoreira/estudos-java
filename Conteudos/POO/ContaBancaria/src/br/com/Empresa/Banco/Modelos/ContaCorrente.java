package br.com.Empresa.Banco.Modelos;

//Implementando a interface Tributação a classe para que seus metodos sejam obrigatorios
public class ContaCorrente extends Conta implements Tributacao{
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		double valorSaca = valor + 0.2;
		super.saca(valorSaca);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.1 ;
	}
}
