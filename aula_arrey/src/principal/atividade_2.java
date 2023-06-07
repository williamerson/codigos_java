package principal;

public class atividade_2 {

	public static void main(String[] args) {
		// *faça um programa que receba 50 números, mostre os números pares  contidos em cada posição do vetor e a sua posição (indice) do vetor;
		
		int [] vetor = new int[50];
		
		int contador = 1;
		
		System.out.println("Numeros pares:");
		for ( int i = 0; i < vetor.length; i ++) {
				vetor[i]= contador;
				contador++;
				if(vetor[i] % 2 == 0) {
					System.out.println("Posição do vetor: " + i + ", Número: " + vetor[i]);
				}
			}
	}

}
