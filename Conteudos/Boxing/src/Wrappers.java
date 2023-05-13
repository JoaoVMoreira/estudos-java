import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		/*
int - Integer
long - Long (l no final dos valores)
double - Double
boolean - Boolean
float - Float
short - Short

Wrappers são classes que possuem metodos que o primitivo não possui
		 */
		
		Boolean status = true; //autoboxing
		Boolean status2 = Boolean.TRUE; //boxing
		//Mesmo resultdo
		
		boolean status3 = Boolean.TRUE; //unboxing - convertendo wrapper para primitivo
		
		/**********************CASTING******************************/
		
		//Recurso para troca dos tipos de valores de um primitivo
		
		int num1 = 10;
		short num2 = (short) num1; //Casting explicito
		
		//Perde a exatidão dos codigos
		
		//Não é possivel realizar a conversão para char
		
		/**********************Exercicio******************************/

		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		Integer num = numero;
		
		System.out.print(num);
	}

}
