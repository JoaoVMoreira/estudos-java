//Classe que irá realizar as tratativas dos metodos para as classes
public class AutenticacaoUtil {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
