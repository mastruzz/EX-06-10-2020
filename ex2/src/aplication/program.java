package aplication;
import java.util.Scanner;

public class program {
	
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int dia, ano, mes;
		System.out.println("Digite a quantidade de dias de vida que voce tem: ");
		dia = ler.nextInt();
		
		ano = dia/ 365;
		mes = (dia % 365)/30;
		dia = (dia % 365)%30;
		
		System.out.printf("Você tem " + ano +" anos, "+ mes + " mes(es) e "+ dia+ " dias");
		
		
	}

}

