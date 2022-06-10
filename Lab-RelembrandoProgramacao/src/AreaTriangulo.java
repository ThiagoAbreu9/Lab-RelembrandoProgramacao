import java.util.Scanner;
import java.lang.*;
public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		if((a+b>c) && (b+c>a) && c+a>b ) {
			System.out.printf("%.2f",area);
		} else {
			System.out.print("Triangulo invalido");
		}
	}
}
