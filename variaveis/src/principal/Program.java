package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 vari�veis s�o espa�os alocados na memoria que salvam uma informa��o (um dado)
		 o tipo int armazena n�meros inteiros
		 int s�o numeros: 1, 2, 3, 4, 10, 150....
		 
		 double que s�o numeros com casa decimais
		 exemplo: 10.50, 25.99, ....
		 
		 char � o tipo que armazena um caractere
		 � um tipo "literal" e a sua inicializa��o � feita com aspas simples
		 exemplos de char: c, d, a 1 ,2...
		 
		 string � uma classe do java utilizada para armazenar cadeias de caracteres (frases por exemplo)
		 sua inicializa��o � feita com aspas duplas
		 exemplos de string: nomes, locais....
		 */
		
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = "will";
		char sexo = 'M';
		
		int num1 = 5;
		int num2 = 10;
		int resultado = num1 + num2;
		
		String nome2 = "williamerson";
		int idade = 35;
		double saldoContaR$ = 2.543;
		
		
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		precoDaCamisa = 50.65;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome);
		System.out.print(sexo);
		System.out.print(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome + " " + sexo + " " + precoDaCamisa );
		System.out.println();
		
		System.out.print(nome + " comprou uma camisa " + " com o valor de: " + precoDaCamisa);
		System.out.println();
		
		nome = "silva";
		System.out.println();
		
		precoDaCamisa = 90.99;
		System.out.println(nome);
		System.out.println(precoDaCamisa);
		
		
		System.out.print(nome2 + " possui " + " com o valor de: " + precoDaCamisa);
		System.out.println();
		System.out.println(2 + 2);
		System.out.println();
	
		num1 = 5;
		num2 = 10;
		
		System.out.println(num1 + num2);		
		System.out.println( "o resultado �: " + resultado );	
		System.out.println( "o resultado �: " + (num1 + num2) );
		/*
		 crie uma variavel com seu nome
		 crie uma variavel com sua idade
		 mostre na tela a frase 
		 williamerson tem 32 anos e possui 5 reais na conta
		 */
			
		System.out.print(nome2 + " tem " + idade + " anos " + " e possui o valor de R$: " + saldoContaR$ + " na conta banc�ria! ");
		System.out.println();
		
		
	}

}
