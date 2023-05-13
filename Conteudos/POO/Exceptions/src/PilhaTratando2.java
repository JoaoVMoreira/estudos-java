/*
public class PilhaTratando2 {

	public static void main(String[] args) {
		System.out.println("Iniciando main");
		try { //Tentando rodar codigo dentro do try
			Metodo1();
		}catch(ArithmeticException | NullPointerException | MinhaExcessao2 ex) { 
			System.out.println("ArithmeticException"); //Excessáo para erros matematicos
			String message = ex.getMessage();//Acionando a mensagem do erro
			System.out.println(message); //Imprimindo a mensagem do erro
			ex.printStackTrace(); //Mostrando o ratro do erro
		}
		
		System.out.println("Finalizando main ");
	}
	
	s
		System.out.println("Iniciando metodo 1 ");
		Metodo2();
		System.out.println("Finalizando metodo 1");
	}
	
	private static void Metodo2() throws MinhaExcessao2{
		System.out.println("Iniciando metodo 2");
		
		throw new MinhaExcessao2("Deu erro!"); //Excessão criada e passando a mensagem de erro
		
		//System.out.println("Finalizando metodo 2");
	}

}*/
