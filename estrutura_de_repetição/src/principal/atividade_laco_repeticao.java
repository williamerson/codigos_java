package principal;

import java.util.Scanner;

public class atividade_laco_repeticao {

	public static void main(String[] args) {
//		 1.Faça um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;
		
			double alt1;
			double alt2;
			double alt3;
			double alt4;
			double alt5;
			double media;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite a altura da primeira pessoa: ");
			alt1 = leia.nextDouble();
			
			System.out.println("Digite a altura da segunda pessoa: ");
			alt2 = leia.nextDouble();
			
			System.out.println("Digite a altura da terceira pessoa: ");
			alt3 = leia.nextDouble();
			
			System.out.println("Digite a altura da quarta pessoa: ");
			alt4 = leia.nextDouble();
			
			System.out.println("Digite a altura da quinta pessoa: ");
			alt5 = leia.nextDouble();
		
			media = (alt1 + alt2 + alt3 + alt4 + alt5)/5;
			
			System.out.println("A media da altura das cinco pessoas é: " + media);
		
	}

}
