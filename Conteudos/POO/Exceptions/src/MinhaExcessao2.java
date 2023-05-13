
public class MinhaExcessao2 extends Exception{ //Criando uma excessão que estende RuntimeException
	public MinhaExcessao2(String msg) {
		super(msg); //Passando a mensagem para a classe mãe
	}
}
