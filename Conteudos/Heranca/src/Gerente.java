//Gerente extends a classe FuncionarioAutentica para receber os parâmetros de funcionario 
//Implementando a interface Autentica, tornando os metodos informados na interface obrigatorios
public class Gerente extends Funcionario implements Autentica{
	
	private AutenticacaoUtil util;
//Criando o construtor e realizando a instanciação do objeto no momento em que a classe é instanciada, para que os dados sejam armazenados
	public Gerente() { 
		this.util = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
}
