package aplication;
import java.util.Scanner;


public class program {
	public static void main(String arg[]) {
		double x1, x2, y2, y1, result;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Valor de x1: ");
		x1 = Sc.nextInt();
		System.out.println("Valor de x2: ");
		x2 = Sc.nextInt();		
		System.out.println("Valor de y1: ");
		y1 = Sc.nextInt();
		System.out.println("Valor de y2: ");
		y2 = Sc.nextInt();
		result = (Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2,2));
		//result = ((x1 -x2)*(x1 -x2)) + ((y1 - y2)*(y1-y2)) ;
		
		System.out.print("o resultado é "+result);
	}	
}
