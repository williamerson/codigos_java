package principal;

import java.util.Scanner;

public class sim_nao {

	public static void main(String[] args) {
		//2.Faça um programa onde o 1 é sim e 0 é não, toda vez que for sim entre em um bloco de código e some mais 1 a uma
//		variável contadora;

		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        // Loop para perguntar ao usuário
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite 1 para SIM ou 0 para NÃO: ");
            int resposta = scanner.nextInt();

            // Verificar se a resposta é SIM (1)
            if (resposta == 1) {
                contador++;
                // Inserir o bloco de código desejado aqui
                System.out.println("Você escolheu SIM!");
            }
        }

        // Exibir o resultado
        System.out.println("O contador de SIMs é: " + contador);

        scanner.close();



	}

}
