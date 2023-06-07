package principal;

import java.util.Scanner;

public class atividade_1{ 

	public static void main(String[] args) {
			// *Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno e mostre a media;
		
		Scanner sc = new Scanner (System.in);
		
		double [] notas = new double [4];
		
		System.out.println("Entren com o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		
		double somaNotas = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Entre com a nota " + (i + 1) + ":");
			notas[i] = sc.nextDouble();
			somaNotas = somaNotas + notas[i];
//			somaNotas += notas[i]; versão mais curto do codigo acima
			
		}
		
		System.out.println("A média do aluno " + nomeAluno + " é: " + (somaNotas / notas.length));
		sc.close();
}
}


