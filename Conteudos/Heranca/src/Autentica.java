//Classe funcionario autentica extends funcionario, sendo abstrata, uma vez que nao se pode criar um Funcionario Autentica
///Criada a interface para que os metodos neccessários para a autenticação sejam obrigatorios nas classes onde a mesma for implementada
public abstract interface Autentica { 
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);


}
