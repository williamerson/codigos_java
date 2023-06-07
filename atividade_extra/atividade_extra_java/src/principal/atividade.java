package principal;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa que receba o salario base de um funcionário (salario bruto) 
		faça o desconto de inss 5% e IR 11% mostre o
		valor dos descontos, e o valor do salario liquido;*/
		
		Scanner leia = new Scanner (System.in);
		
		double salBruto;
		
		System.out.println("qual o valor de seu salrio bruto: ");
		salBruto = leia.nextDouble();
		
		double descInss = (salBruto * 5/100 );
		double descIr = (salBruto * 11/100);
		double salLiquido = (salBruto - descInss - descIr);
		double totalDesc = descInss + descIr;
		
		System.out.println("O valor total dos descontos é: " + totalDesc);
		System.out.println("Seu salario liquido é: " + salLiquido);
		
		
		
	}

}
