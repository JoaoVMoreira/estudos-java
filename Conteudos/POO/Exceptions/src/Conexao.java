
public class Conexao {
	public Conexao() {
		System.out.println("Iniciando conexão");
	}
	
	public void letDados() {
		System.out.println("Lendo dados");
		throw new IllegalStateException("Erro de conexao");
	}
	
	public void fecha() {
		System.out.println("Fechando conexão");
	}
}
