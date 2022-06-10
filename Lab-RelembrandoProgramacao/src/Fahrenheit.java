import java.util.Scanner;
public class Fahrenheit {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float num = teclado.nextFloat();
		
		float fahr;
		
		fahr = (9*num/5)+32;
		
		System.out.printf("%.1f", fahr);
	}
}
