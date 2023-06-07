package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//for é usado quando sabemos a quantidade de vezes que irá repetir
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("/******/");
		int i = 0;
		//while é usado quando não sabemos a quntidade de vezes que iremos repetir
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja continuar? ");
		char opcao = sc.next() .charAt(0);
		int j = 0;
		while(opcao == 's') {
			j++;
			System.out.print("Deseja continuar? ");
			opcao = sc.next() .charAt(0);
		}
		System.out.println("Entrou no while: " + j);
		//do while, garante que será executado o bloco de codigos ao menos 1 vez
		int k = 0;
		do {
			System.out.println("Deseja continuar? ");
			opcao = sc.next().charAt(0);
			k++;
		}while(Character.toUpperCase(opcao) == 's');
		System.out.println("Entrou no do wilhe: " + k);
	
		sc.close();
		
	}

}
