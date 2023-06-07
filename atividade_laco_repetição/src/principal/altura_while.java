package principal;

import java.util.Scanner;

public class altura_while {

	public static void main(String[] args) {
		//3.Faça o mesmo programa do exercício 1 mas usando while;

		Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double somaAlturas = 0;
        double altura = 0;
        
        // Ler a altura das 5 pessoas usando while
        while (contador < 5) {
            System.out.print("Digite a altura da pessoa " + (contador + 1) + ": ");
             altura = scanner.nextDouble();
            somaAlturas += altura;
            contador++;
        }

        // Calcular a média das alturas
        double mediaAlturas = somaAlturas / 5;

        // Exibir o resultado
        System.out.println("A média das alturas é : " + mediaAlturas);

        scanner.close();
	}

}
