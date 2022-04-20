import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		
		double a;
		a = sc.nextDouble();
		System.out.println("Voce digitou: " + a);
		
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);//Sysout + ctl + espaço
		
		char b;
		b = sc.next().charAt(0);
		System.out.println("Voce digitou: " + b);
		
		sc.close();
		

	}

}
