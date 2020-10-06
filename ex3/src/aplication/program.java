package aplication;
import java.util.Scanner;

public class program {
	public static void main(String args[]) {
		int min,seg, hor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a duração do evento em segundos: ");
		seg = ler.nextInt();
		
		hor = seg / 3600;
		min = seg % 3600;
		seg = (min % 3600 )% 60;
		
		System.out.printf("A duração do evento foi de "+ hor+" horas "+ min +" minutos e "+ seg +"  segundos");
	}
}
