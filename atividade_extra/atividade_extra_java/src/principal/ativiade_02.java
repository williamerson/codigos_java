package principal;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ativiade_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar hoje = new GregorianCalendar();
		Scanner leia = new Scanner(System.in);
		
		int ano = hoje.get(Calendar.YEAR);
		int anoNasc;
		
		System.out.println("Digite o ano em que você nasceu: ");
		anoNasc = leia.nextInt();
		
		int anoAtu = (ano - anoNasc);
		
		System.out.println("voce tem " + anoAtu + " anos.");

	}

}
