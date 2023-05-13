package br.com.Empresa.Banco.Modelos;

//Classe calcula imposto é responsável por realizar o calculo do imposto total e tambem por registrar o imposto de uma outra classe
public class CalculaImposto {
	private double TotImposto;
	
	//Passando Tributação como parâmetro para que o metodo funcione em diferentes tipos de contas
	public void registra(Tributacao t) {
		double valor = t.getValorImposto(); //Capturando o imposto aplicado a classe
		this.TotImposto += valor; //Somando o valor do imposto ao imposto que já estava registrado
	}
	
	public double getTotImposto() {
		return this.TotImposto; //Retornando o valor total do imposto calculado
	}
}
