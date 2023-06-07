package principal;

import java.util.Scanner;

public class atividade_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que peça um número e então mostre a mensagem, O número informado foi [número]
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		System.out.println("Informe um numero: ");
		num = leia.nextInt();
		
		System.out.println("O número informado é: " + num);
		
		
		
	}

}
