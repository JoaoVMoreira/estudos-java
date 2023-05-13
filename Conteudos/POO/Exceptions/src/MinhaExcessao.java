
public class MinhaExcessao extends RuntimeException{ //Criando uma excessão que estende RuntimeException
	public MinhaExcessao(String msg) {
		super(msg); //Passando a mensagem para a classe mãe
	}
}
