package principal;

import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double not1;
		double not2;
		double not3;
		double not4;
	
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe a 1� nota: ");
		not1 = leia.nextDouble();
		
		System.out.println("Informe a 2� nota: ");
		not2 = leia.nextDouble();

		System.out.println("Informe a 3� nota: ");
		not3 = leia.nextDouble();
		
		System.out.println("Informe a 4� nota: ");
		not4 = leia.nextDouble();
		
		double media = (not1 + not2 + not3 + not4) / 4;
		System.out.println("Media: "+media);
		
		if(media < 6) {
			System.out.println("Reprovado");
		}if(media >= 6 && media <=7 ) {
			System.out.println("Recupera��o");
		}if(media > 7 && media <= 9) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Aprovado, Parab�ns!");
		}
	}

}
