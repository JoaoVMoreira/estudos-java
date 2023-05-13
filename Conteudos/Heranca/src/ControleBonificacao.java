
public class ControleBonificacao {

	private double soma;
	
	public double registra(Funcionario f) {
		double bonifica = f.getBonificacao();
		
		return f.getSalario() + bonifica;
	}

	public double getSoma() {
		return soma;
	}
	
	
	
}
