package principal;

import java.util.Scanner;

public class atividade_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que pe�a dois n�meros e imprima a soma
		
		Scanner leia = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Informe o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("A soma dos dois numeros informados �: " + (num1 + num2));
		
		
	}

}
