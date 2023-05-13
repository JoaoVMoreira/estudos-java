//Implementando a interface Autentica, tornando os metodos informados na interface obrigatorios
public class Cliente implements Autentica{
//Criando o construtor e realizando a instanciação do objeto no momento em que a classe é instanciada, para que os dados sejam armazenados
	public Cliente() {
		this.util = new AutenticacaoUtil();
	}
	
	private AutenticacaoUtil util;

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
