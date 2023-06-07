package principal;

import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		//1.Faça um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;

		Scanner scanner = new Scanner(System.in);
        double somaAlturas = 0;

        // Pedir ao usuário para inserir as alturas das 5 pessoas
        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite a altura da pessoa " + contador + ": ");
            double altura = scanner.nextDouble();
            somaAlturas += altura;
        }

        // Calcular a média das alturas
        double mediaAlturas = somaAlturas / 5;

        // Exibir o resultado
        System.out.println("A média das alturas é: " + mediaAlturas);

        scanner.close();
		
		
	}

}
