package principal;

import java.util.Scanner;

public class atividade_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que peça as 4 notas bimestrais e mostre a média.
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		System.out.println("A nota do primeiro bimestre é: ");
		nota1 = leia.nextDouble();
		System.out.println("A nota do segundo bimestre é: ");
		nota2 = leia.nextDouble();
		System.out.println("A nota do terceiro bimestre é: ");
		nota3 = leia.nextDouble();
		System.out.println("A nota do quarto bimestre é: ");
		nota4 = leia.nextDouble();
		
		System.out.println("A média das quatro notas bimestrais é: " + (nota1 + nota2 + nota3 + nota4)/4);
	
		
	}

}
