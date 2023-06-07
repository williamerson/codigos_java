package principal;

import java.util.Scanner;

public class ativiade_1 {

	public static void main(String[] args) {
//		 
				
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de operação (soma, divisão, multiplicação, subtração): ");
        String operacao = scanner.nextLine();
     
        
        System.out.print("Digite o número para a tabuada: ");
        int numero = scanner.nextInt();
        
        switch (operacao) {
            case "soma":
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero + i;
                    System.out.println(numero + " + " + i + " = " + resultado);
                }
                break;
                
            case "subtração":
    			int aux = numero;
    			for (int i = 1; i <= 10; i++) {
    				int resultado = (++aux) - numero;
    				System.out.println((aux) + " - " + numero + " = " + resultado);
    			}
    			break;
    			
            case "multiplicação":
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
                break;

            case "divisão":
            	for(int i = 1; i <= 10; i++) {
            		System.out.println((numero * i) + " ÷ " + numero + " = " + (numero * i / numero));
            	}
                break;

            default:
                System.out.println("Operação inválida!");
	}
}
}
