package principal;

import java.util.Scanner;

public class ativiade_1 {

	public static void main(String[] args) {
//		 
				
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de opera��o (soma, divis�o, multiplica��o, subtra��o): ");
        String operacao = scanner.nextLine();
     
        
        System.out.print("Digite o n�mero para a tabuada: ");
        int numero = scanner.nextInt();
        
        switch (operacao) {
            case "soma":
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero + i;
                    System.out.println(numero + " + " + i + " = " + resultado);
                }
                break;
                
            case "subtra��o":
    			int aux = numero;
    			for (int i = 1; i <= 10; i++) {
    				int resultado = (++aux) - numero;
    				System.out.println((aux) + " - " + numero + " = " + resultado);
    			}
    			break;
    			
            case "multiplica��o":
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
                break;

            case "divis�o":
            	for(int i = 1; i <= 10; i++) {
            		System.out.println((numero * i) + " � " + numero + " = " + (numero * i / numero));
            	}
                break;

            default:
                System.out.println("Opera��o inv�lida!");
	}
}
}
