package principal;

public class atividade_1 {

	public static void main(String[] args) {
		/*1 Programa em Java que mostra os n�meros �mpares ate 25
		2 Altere o primeiro programa para mostrar a soma dos n�meros impares
		3 altere novamente o programa para mostrar os n�meros impares um abaixo do outro e depois um ao lado do outro
		*/
		
				int soma = 0;
				for( int contador = 0; contador <= 25; contador ++) {
					
					if(contador %2 != 0) {
						System.out.println(contador + " ");
						soma += contador;// � a mesma coisa de (soma = soma + contaor)
						
					}
				}
			
						for( int contador = 0; contador <= 25; contador ++) {
							
							if(contador %2 != 0) {
								System.out.print(contador + " ");
				
					}
				}
				System.out.println("A soma dos numeros impares: " + soma);
		
		    }
		
		
	}


