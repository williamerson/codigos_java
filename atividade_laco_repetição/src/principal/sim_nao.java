package principal;

import java.util.Scanner;

public class sim_nao {

	public static void main(String[] args) {
		//2.Fa�a um programa onde o 1 � sim e 0 � n�o, toda vez que for sim entre em um bloco de c�digo e some mais 1 a uma
//		vari�vel contadora;

		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        // Loop para perguntar ao usu�rio
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite 1 para SIM ou 0 para N�O: ");
            int resposta = scanner.nextInt();

            // Verificar se a resposta � SIM (1)
            if (resposta == 1) {
                contador++;
                // Inserir o bloco de c�digo desejado aqui
                System.out.println("Voc� escolheu SIM!");
            }
        }

        // Exibir o resultado
        System.out.println("O contador de SIMs �: " + contador);

        scanner.close();



	}

}
