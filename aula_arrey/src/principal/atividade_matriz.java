package principal;

public class atividade_matriz {

	public static void main(String[] args) {
		int[][] numero = new int[3][3];
		
		int contador = 1;
			
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
				numero[i][j] = contador;
					
				if (i == j && (numero[i][j] == 1 || numero[i][j] == 5 || numero[i][j] == 9)) {
					System.out.print(numero[i][j] + "\t");
				} else {
					System.out.print("\t");
				}	
					contador++;
				}
			
				System.out.println("\n");
			}

	}

}
