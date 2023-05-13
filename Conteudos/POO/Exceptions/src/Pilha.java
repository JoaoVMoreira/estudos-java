
public class Pilha {

	public static void main(String[] args) {
		System.out.println("Iniciando main");
		try { //Tentando rodar codigo dentro do try
			Metodo1();
		}catch(ArithmeticException | NullPointerException ex) { //ArithmeticException - Em caso de erro retornamos a excessão; NullPointerException - erro por retornos nulos de classes
			System.out.println("ArithmeticException"); //Excessáo para erros matematicos
			String message = ex.getMessage();//Acionando a mensagem do erro
			System.out.println(message); //Imprimindo a mensagem do erro
			ex.printStackTrace(); //Mostrando o ratro do erro
		}
		
		System.out.println("Finalizando main ");
	}
	
	private static void Metodo1() {
		System.out.println("Iniciando metodo 1 ");
		Metodo2();
		System.out.println("Finalizando metodo 1");
	}
	
	private static void Metodo2() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i/0;
		}
	}

}
