package principal;

import java.util.Scanner;

public class atividade_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		System.out.println("A nota do primeiro bimestre �: ");
		nota1 = leia.nextDouble();
		System.out.println("A nota do segundo bimestre �: ");
		nota2 = leia.nextDouble();
		System.out.println("A nota do terceiro bimestre �: ");
		nota3 = leia.nextDouble();
		System.out.println("A nota do quarto bimestre �: ");
		nota4 = leia.nextDouble();
		
		System.out.println("A m�dia das quatro notas bimestrais �: " + (nota1 + nota2 + nota3 + nota4)/4);
	
		
	}

}
