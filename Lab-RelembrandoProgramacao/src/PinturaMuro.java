import java.util.Scanner;
public class PinturaMuro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num = teclado.nextFloat();
		float p = 100;
		float custo;
		custo = p + (num*12*3);
		
		System.out.printf("%.1f", custo);
	}
}
