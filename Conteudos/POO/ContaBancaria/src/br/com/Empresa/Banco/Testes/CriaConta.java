package br.com.Empresa.Banco.Testes;

import br.com.Empresa.Banco.Modelos.*;

public class CriaConta {

	public static void main(String[] args) {
		//GetESet();
		//Override();
		//Tributa();
		TesteException();
	}
	
	public static void GetESet() {
		Conta conta = new Conta(123, 456);
		Conta conta2 = new Conta(1156, 62951);
		System.out.println(Conta.getTotal());
		
	}
	
	public static void Override() {
		System.out.println("*****************************************");
		ContaCorrente conta = new ContaCorrente(111, 222);
		ContaPoupanca conta1 = new ContaPoupanca(444, 333);
		
		conta.deposita(100.0);
		conta1.deposita(100.0);
		
		conta.tranfere(10.0, conta1);
		
		System.out.println("CC: " + conta.getSaldo());
		System.out.println("CP: " + conta1.getSaldo());
		
	}
	
	public static void Tributa() {
		System.out.println("*****************************************");

		ContaCorrente cc = new ContaCorrente(222, 333);
		SeguroDeVida sv = new SeguroDeVida();
		
		cc.deposita(100.0);
		
		CalculaImposto calc = new CalculaImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(cc.getValorImposto());
		System.out.println(sv.getValorImposto());
		
		System.out.println(calc.getTotImposto());
	}
	
	public static void TesteException() {
		System.out.println("*****************************************");

		ContaCorrente cc = new ContaCorrente(2222, 26565);
		
		cc.deposita(200.0);
		try {
			cc.saca(210.00);
		}catch (SacaException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
