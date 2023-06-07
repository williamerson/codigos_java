package principal;

import java.util.Scanner;

public class atividade_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius
		//C=5*((F-332)/9)
		Scanner leia = new Scanner (System.in);
		
		double tempFahrenheit;
				
		System.out.println("qual a temperatura em Fahrenheit: ");
		tempFahrenheit = leia.nextDouble();
		
		double tempCelsius = (5 * (tempFahrenheit-32)/9);
		
		System.out.println("A temperatura em grau Celsius é: " + tempCelsius);

	}

}
