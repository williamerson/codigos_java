package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 10;
		int numero2 = 25;
		boolean bool = false;
		
		if(numero1 >= numero2) {
			System.out.println ("numero1 � o maior");
			
		}
		else {
			System.out.println("numero2 � o maior");
		}
		
		if (!bool == true) {
			System.out.println("verdadeiro");
		}
		
		else {
			System.out.println("falso");
		}
		/*
		 * Exemplo usando resto da divis�o
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com o numero para saber se ele � par ou impar: ");
		
		numero = leia.nextInt();
		
		if (numero % 2 == 0){
			System.out.println("Numero par!");
		}
		
		else {
			System.out.println("numero impar!");
		}
		
		leia.close();

	}

}
