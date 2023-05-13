package br.com.Empresa.Banco.Modelos;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia) {
		Conta.total++;
		//System.out.println(Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criando uma conta. ");
	}
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode numero menor que 0");
			return;
		}
		
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode numero menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void saca(double valor) {
		if(this.saldo < valor) {
			throw new SacaException("Valor: " + valor + ", " + "Saldo: " + this.saldo);
		}
		
		this.saldo -= valor;
	}
	
	public void tranfere(double valor, Conta destino) {
			this.saldo -= valor;
			destino.deposita(valor);
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
}
