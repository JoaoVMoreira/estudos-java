//Sistema interno 
public class SistemaInterno{
	
	private int senha = 2222; //Setando senha padrão
	
	public void autentica(Autentica g) { //Verificando se o FuncionarioAutentica informou a senha correta
		boolean autenticou = g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Autenticou");
		}else {
			System.out.println("Não autenticou");
		}
	}
}
