package principal;

import java.util.Random;

public class Program1 {

	public static void main(String[] args) {
		
		/*Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros que sa�ram. 
		 * Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, se os 3 dados sa�rem 
		 * com a mesma numera��o ele ganha 6 pontos de b�nus e deve aparecer a mensagem "voc� � muito sortudo". 
		 * Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, 
		 * mas voc� perdeu" , se for maior ou igual a 15 ele ganha e apresenta a mensagem "

		parab�ns, voc� ganhou!" .
		*/
		
		Random random = new Random();
		
		
		int valor1 = random.nextInt(6) + 1 ;
	    System.out.println("Segundo n�mero gerado: " + valor1);
	    
		int valor2 = random.nextInt(6) + 1 ;
	    System.out.println("Segundo n�mero gerado: " + valor2);
	    
	    int valor3 = random.nextInt(6) + 1 ;
	    System.out.println("Terceiro gerado: " + valor3);
	    
	    int soma = (valor1 + valor2 + valor3);
	    System.out.println("A soma dos valores e de: " + soma + " \n ");
		
	  //Se os valores dos 3 dados forem igual, entra nesse bloco de "if - else"
	    if(valor1 == valor2 && valor1 == valor3 && valor2 == valor3) {
	    	
	    	System.out.println("Voce � muito sortudo, acaba de ganhar mais 6 pontos de b�nus!!");
	    	
	  //se a soma dos dados mais o valor do b�nus for maior que 15 ele executa que ganhou esse bloco 
	    	if(soma + 6 >= 15) {
	    			System.out.println("E com a soma do b�nus e do dados passou de 15 pontos, Parab�ns voc� ganhou!!!");
	    			System.exit(0);
	    	}
	    	
	    	//se n�o ele entra nesse bloco se for menor que 15.
	    	else{
	    		System.out.println("Mas infelismente n�o atingiu um valor maior que 15, lamento, vo�� perdeu tudo!!!");
	    		System.exit(0);
	    		
	    	}
	    }
	    
	  //se cairem somente 2 numeros iguais ele entra nesse bloco.
		if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
		   	
			System.out.println("Parab�ns, voce acaba de ganhar mais 2 pontos de b�nus!!! \n");
		   	
		   	if(soma + 2 >= 15) {
    			System.out.println("E com a soma do b�nus e do dados passou de 15 pontos, Parab�ns voc� ganhou!!!");
    			System.exit(0);
		   	}
		   	if(soma + 2 < 15) {
		   		System.out.println("Mas infelismente n�o atingil um valor maior que 15, lamento, perdeu tudo!");
		   		System.exit(0);
		   	}
		   	
		}
		else{
	    	System.out.println("Tente novamente!!!");
	    }

	}

}

