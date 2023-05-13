public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saca(valor);
			return true;
		}
		return false;
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
}
