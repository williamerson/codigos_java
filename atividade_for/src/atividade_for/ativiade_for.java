package atividade_for;

public class ativiade_for {

	public static void main(String[] args) {
		
		int soma = 0;
		for( int contador = 0; contador <= 25; contador ++) {
			
			if(contador %2 != 0) {
				System.out.println(contador + " ");
				soma += contador;// é a mesma coisa de (soma = soma + contaor)
				
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
