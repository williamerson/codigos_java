package principal;

import java.util.Scanner;

public class atividade_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que leia 3 numeros e mostre o maior deles;
		
		int num1;
		int num2;
		int num3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre como segundo numero:");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro numero:");
		num3 = leia.nextInt();
		
		
		 if(num1 > num2 && num1 > num3) {
			 System.out.println ("O maior numero entre os treis digitados �: " + num1);
			
		}
		 if (num2 > num3 && num2 > num1) {
			 System.out.println("O maior numero entre os treis digitados �: " + num2);
		 }
		 if (num3 > num1  && num3 > num2) {
			 System.out.println("O maior numero entre os treis digitados �: " + num3);
		 }
		 
		 
		
		
	}

}
