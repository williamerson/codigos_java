package principal;

import java.util.Random;
import java.util.Scanner;

public class ativiade_3 {

	public static void main(String[] args) {
		// *Usando o random faça uma simulação de um sorteio, cadastrando 10 pessoas, 
//		apenas uma pessoa será a ganhadora para a proxima turma de java do senai;
		Scanner sc = new Scanner(System.in);
        Random sorteio = new Random();
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe um nome para o sorteio: ");
            nomes[i] = sc.nextLine();
        }
        
        int sorteioGanhador = sorteio.nextInt(nomes.length);
        String ganhador = nomes[sorteioGanhador];

        System.out.println("O vencedor do sorteio é: " + ganhador);

        sc.close();
    }
		
	}



