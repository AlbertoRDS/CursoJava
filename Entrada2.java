import java.util.Scanner;

public class Entrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a;
		int y;
		String x;
		char b;
		
		a = sc.nextDouble();
		y = sc.nextInt();
		x = sc.next();
		b = sc.next().charAt(0);
		
		System.out.println("Dados digitados:  ");
		System.out.println(a);
		System.out.println(y);
		System.out.println(x);
		System.out.println(b);
		

	}

}
