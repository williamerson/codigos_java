package principal;

public class atividade_2 {

	public static void main(String[] args) {
		// *fa�a um programa que receba 50 n�meros, mostre os n�meros pares  contidos em cada posi��o do vetor e a sua posi��o (indice) do vetor;
		
		int [] vetor = new int[50];
		
		int contador = 1;
		
		System.out.println("Numeros pares:");
		for ( int i = 0; i < vetor.length; i ++) {
				vetor[i]= contador;
				contador++;
				if(vetor[i] % 2 == 0) {
					System.out.println("Posi��o do vetor: " + i + ", N�mero: " + vetor[i]);
				}
			}
	}

}
