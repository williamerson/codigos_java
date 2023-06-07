package principal;

import java.util.Scanner;

public class atividade_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mês. calcule e mostre o ttotal do seu salário no referido mes
		Scanner leia = new Scanner (System.in);
		
		double valorHora;
		double horasTrab;
				
		System.out.println("qual o valor que voce ganha por hora: ");
		valorHora = leia.nextDouble();
		
		System.out.println("Quantas horas trabalhadas durante o mês: ");
		horasTrab = leia.nextDouble();
				
				
		double salarioMes = (valorHora*horasTrab);
		
		
		
		System.out.println("Seu salário é de: " + salarioMes);
	}

}
