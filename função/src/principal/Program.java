package principal;

import java.util.Random;

public class Program {
	
	


	public static void main(String[] args){
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(4 ));
		calculo();  
		somaDoisNumeros(12, 18);
		System.out.println(ganhador());
//		int meuNumero = 650;
//		System.out.println(mensagem4(meuNumero));
		
//		String recebemensagem = mensagem3();
//		System.out.println(recebemensagem);
		
	}
	static void mensagem() {
		System.out.println("primeiro void");
	}
	static void mensagem2(double n) {
		System.out.println("O numero informado foi: " + n);
	}
	static String mensagem3() {
		return "Aqui é minha função de numero 3";
	}
	static String mensagem4(int x) {
		return "Numero informado: " + x;
		
	}
	
//	static int exemploDoIgor (double y) {
//		return (int)y;
	
	
	static void calculo() {
		
		int num1 = 5;
		int num2 = 7;
		int soma = num1+num2;
		System.out.println("soma dos dois numeros: " + soma);
		
	}
	static void somaDoisNumeros (int x, int y) {
		int resultado = x + y;
		System.out.println("O resultado da soma é; "+ resultado);
		System.out.println("Outra forma de mostrar o resultado da soma: " +(x + y));
	}
	
	static String ganhador() {
		Random random = new Random();
		int numeroSorteado = random.nextInt(11);
		String[] nomes = {"Jose luíz", "Luan muruk", "Claudia", "Matheus","leone","Andre", "Fernanda", "Elson", "Guilherme", "Kamylla"};
		return "O ganhador foi: " + nomes[numeroSorteado];
	}
}
