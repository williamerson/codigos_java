package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		int[] numeros2 = {100, 250, 02, 25, 88};
		String[] nomes = new String[3];
		
				
				numeros[0] = 10;
				numeros[1] = 25;
				numeros[2] = 1;
				numeros[3] = 99;
				numeros[4] = 33;
				
				System.out.println(numeros[4]);
				System.out.println(numeros2[2]);
		
				/*Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Quantos nomes deseja salvar na mem�ria: ");
			int qtd = sc.nextInt();
			sc.nextLine();
			
			String[] nomes = new String[qtd];
//			for para insrir os dados
			for(int contador = 0; contador < nomes.length; contador++) {
				System.out.print("Entre com o nome: ");
				nomes[contador] = sc.nextLine();
			}
//			for usado para exibir os dados
			for(int contador = 0; contador < nomes.length; contador++) {
				System.out.println(nomes[contador]);
			}
			for(String nome: nomes) {
				System.out.println(nome);
			}
			
			String verificar = "willi";
			if(nomes[0].equals(verificar)) {
				System.out.println("� igual");
			}
			
			sc.close();
			/*String nome1 = new String("willi");
			String nome2 = new String ("willi");
			String nome3 = "willi";
			
			System.out.println(nome1.equals(nome2));*/
			
			
			
			
			
		

	}

}
