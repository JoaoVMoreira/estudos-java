
public class TesteBanco {
	public static void main(String[] args) {
		/*Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Joao Moreira");
		funcionario.setSalario(5600.00);
		funcionario.setCpf("519783658-2");
		
		System.out.println(funcionario.getBonificacao());*/
		
		criaGerente();
		AutenticaSistemaInterno();
	}
	
	public static void criaGerente() {
		System.out.println("******************************");
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Joao");
		gerente.setCpf("95199984");
		gerente.setSalario(5000.00);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getCpf());
		
		gerente.setSenha(2222);
		
		System.out.println(gerente.autentica(2222));
		System.out.println(gerente.getBonificacao());
	}
	public static void AutenticaSistemaInterno() {
		System.out.println("******************************");
		Gerente g = new Gerente();
		SistemaInterno si = new SistemaInterno();
		Administrador a = new Administrador();
		
		a.setSenha(2222);
		g.setSenha(3333);
		
		si.autentica(g);
		si.autentica(a);
	}
}
